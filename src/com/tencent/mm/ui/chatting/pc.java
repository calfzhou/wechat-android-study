package com.tencent.mm.ui.chatting;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.mm.b;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;

final class pc
  implements MediaPlayer.OnCompletionListener
{
  pc(ox paramox)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    z.d("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "on completion");
    ox.e(this.jwA).setVisibility(0);
    ox.e(this.jwA).startAnimation(AnimationUtils.loadAnimation(this.jwA.getContext(), b.Mv));
    ox.b(this.jwA).dx();
    ox.d(this.jwA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pc
 * JD-Core Version:    0.6.2
 */