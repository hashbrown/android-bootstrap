// Code generated by dagger-compiler.  Do not edit.
package com.donnfelker.android.bootstrap;


import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class BootstrapModule$$ModuleAdapter extends ModuleAdapter<BootstrapModule> {
  private static final String[] INJECTS = { "members/com.donnfelker.android.bootstrap.BootstrapApplication", "members/com.donnfelker.android.bootstrap.authenticator.BootstrapAuthenticatorActivity", "members/com.donnfelker.android.bootstrap.ui.CarouselActivity", "members/com.donnfelker.android.bootstrap.ui.BootstrapTimerActivity", "members/com.donnfelker.android.bootstrap.ui.CheckInsListFragment", "members/com.donnfelker.android.bootstrap.ui.NewsActivity", "members/com.donnfelker.android.bootstrap.ui.NewsListFragment", "members/com.donnfelker.android.bootstrap.ui.UserActivity", "members/com.donnfelker.android.bootstrap.ui.UserListFragment", "members/com.donnfelker.android.bootstrap.core.TimerService", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public BootstrapModule$$ModuleAdapter() {
    super(INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, false /*library*/);
  }

  @Override
  protected BootstrapModule newModule() {
    return new com.donnfelker.android.bootstrap.BootstrapModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(Map<String, Binding<?>> map) {
    map.put("com.squareup.otto.Bus", new ProvideOttoBusProvidesAdapter(module));
    map.put("com.donnfelker.android.bootstrap.authenticator.LogoutService", new ProvideLogoutServiceProvidesAdapter(module));
  }

  /**
   * A {@code Binder<com.squareup.otto.Bus>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Being a {@code Provider<com.squareup.otto.Bus>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideOttoBusProvidesAdapter extends Binding<com.squareup.otto.Bus>
      implements Provider<com.squareup.otto.Bus> {
    private final BootstrapModule module;

    public ProvideOttoBusProvidesAdapter(BootstrapModule module) {
      super("com.squareup.otto.Bus", null, IS_SINGLETON, "com.donnfelker.android.bootstrap.BootstrapModule.provideOttoBus()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.squareup.otto.Bus>}.
     */
    @Override
    public com.squareup.otto.Bus get() {
      return module.provideOttoBus();
    }
  }

  /**
   * A {@code Binder<com.donnfelker.android.bootstrap.authenticator.LogoutService>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   * 
   * Owning the dependency links between {@code com.donnfelker.android.bootstrap.authenticator.LogoutService} and its
   * dependencies.
   * 
   * Being a {@code Provider<com.donnfelker.android.bootstrap.authenticator.LogoutService>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideLogoutServiceProvidesAdapter extends Binding<com.donnfelker.android.bootstrap.authenticator.LogoutService>
      implements Provider<com.donnfelker.android.bootstrap.authenticator.LogoutService> {
    private final BootstrapModule module;
    private Binding<android.content.Context> context;
    private Binding<android.accounts.AccountManager> accountManager;

    public ProvideLogoutServiceProvidesAdapter(BootstrapModule module) {
      super("com.donnfelker.android.bootstrap.authenticator.LogoutService", null, IS_SINGLETON, "com.donnfelker.android.bootstrap.BootstrapModule.provideLogoutService()");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Used internally to link bindings/providers together at run time
     * according to their dependency graph.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void attach(Linker linker) {
      context = (Binding<android.content.Context>) linker.requestBinding("android.content.Context", BootstrapModule.class);
      accountManager = (Binding<android.accounts.AccountManager>) linker.requestBinding("android.accounts.AccountManager", BootstrapModule.class);
    }

    /**
     * Used internally obtain dependency information, such as for cyclical
     * graph detection.
     */
    @Override
    public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
      getBindings.add(context);
      getBindings.add(accountManager);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.donnfelker.android.bootstrap.authenticator.LogoutService>}.
     */
    @Override
    public com.donnfelker.android.bootstrap.authenticator.LogoutService get() {
      return module.provideLogoutService(context.get(), accountManager.get());
    }
  }
}
