package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.a.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.ui.ExposeWithProofUI;
import java.lang.ref.WeakReference;

final class m
  implements View.OnClickListener
{
  m(l paraml)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.setClass((Context)l.a(this.iWJ).get(), ExposeWithProofUI.class);
    localIntent.putExtra("k_username", l.b(this.iWJ));
    if (!l.c(this.iWJ))
      localIntent.putExtra("k_expose_scene", 39);
    while (true)
    {
      localIntent.putExtra("k_from_profile", true);
      ((Context)l.d(this.iWJ).get()).startActivity(localIntent);
      bg.qW().py().eC(l.b(this.iWJ));
      bg.qW().py().eC(l.e(this.iWJ));
      return;
      localIntent.putExtra("k_expose_scene", 36);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.m
 * JD-Core Version:    0.6.2
 */