package com.tencent.mm.ui.pluginapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.mm.ui.base.preference.IconMsgPreference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.y.au;

final class ac
  implements au
{
  ac(t paramt)
  {
  }

  public final void d(Bitmap paramBitmap)
  {
    IconMsgPreference localIconMsgPreference = (IconMsgPreference)t.a(this.jKV).BU("jd_market_entrance");
    if (localIconMsgPreference != null)
    {
      localIconMsgPreference.setIconDrawable(new BitmapDrawable(this.jKV.agh().getResources(), paramBitmap));
      t.a(this.jKV).notifyDataSetChanged();
      t.f(this.jKV);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.ac
 * JD-Core Version:    0.6.2
 */