package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.player.MainMusicPlayerUI;
import java.lang.ref.WeakReference;

final class af
  implements View.OnClickListener
{
  af(ae paramae)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.setClass((Context)ae.a(this.iWR).get(), MainMusicPlayerUI.class);
    ((Context)ae.b(this.iWR).get()).startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.af
 * JD-Core Version:    0.6.2
 */