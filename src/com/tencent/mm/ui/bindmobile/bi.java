package com.tencent.mm.ui.bindmobile;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ac;
import com.tencent.mm.storage.e;

final class bi
  implements View.OnClickListener
{
  bi(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final void onClick(View paramView)
  {
    bg.qW().oQ().set(12322, Boolean.valueOf(false));
    ac.f(false, false);
    FindMContactLearmMoreUI.b(this.jkM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bi
 * JD-Core Version:    0.6.2
 */