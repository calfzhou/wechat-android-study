package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.account.FacebookFriendUI;
import java.lang.ref.WeakReference;

final class p
  implements View.OnClickListener
{
  p(o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    bg.qW().oQ().set(65833, Integer.valueOf(0));
    ((Context)o.b(this.iWK).get()).startActivity(new Intent((Context)o.a(this.iWK).get(), FacebookFriendUI.class));
    o.c(this.iWK).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.p
 * JD-Core Version:    0.6.2
 */