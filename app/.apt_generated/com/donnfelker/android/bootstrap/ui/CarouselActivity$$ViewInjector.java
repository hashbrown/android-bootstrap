// Generated code from Butter Knife. Do not modify!
package com.donnfelker.android.bootstrap.ui;

import android.view.View;
import butterknife.Views.Finder;

public class CarouselActivity$$ViewInjector {
  public static void inject(Finder finder, com.donnfelker.android.bootstrap.ui.CarouselActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131034182);
    target.indicator = (com.viewpagerindicator.TitlePageIndicator) view;
    view = finder.findById(source, 2131034183);
    target.pager = (android.support.v4.view.ViewPager) view;
  }
}
