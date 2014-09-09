package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.widget.ImageView;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.r;
import com.tencent.mm.aq.a;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.VideoView;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.y.ap;

final class oy
  implements MediaPlayer.OnErrorListener
{
  oy(ox paramox)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.e("!44@/B4Tb64lLpKYc17gQ4E+i2zzIzCJ7JpqKkNH7lU5Rrk=", "on play video error, what %d extra %d", arrayOfObject);
    ox.b(this.jwA).stopPlayback();
    e.b(this.jwA.getContext(), com.tencent.mm.n.cnV, com.tencent.mm.n.bzX);
    String str = m.AL().ic(ox.c(this.jwA));
    Bitmap localBitmap = ap.yg().a(str, a.getDensity(this.jwA.getContext()), this.jwA.getContext(), -1);
    ImageView localImageView = (ImageView)this.jwA.findViewById(i.cAF);
    localImageView.setImageBitmap(localBitmap);
    localImageView.setVisibility(0);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oy
 * JD-Core Version:    0.6.2
 */