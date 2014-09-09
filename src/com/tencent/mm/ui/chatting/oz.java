package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;

final class oz
  implements View.OnClickListener
{
  oz(ox paramox)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("check", "onclick");
    if (ox.b(this.jwA).isPlaying())
      ox.a(this.jwA);
    new cm().post(new pa(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oz
 * JD-Core Version:    0.6.2
 */