package com.tencent.mm.sdk.platformtools;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class bm
  implements MediaPlayer.OnCompletionListener
{
  bm(String paramString, AssetFileDescriptor paramAssetFileDescriptor, bn parambn)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    int i = -1;
    Object[] arrayOfObject1 = new Object[2];
    int j;
    if (paramMediaPlayer == null)
      j = i;
    Object[] arrayOfObject2;
    while (true)
    {
      arrayOfObject1[0] = Integer.valueOf(j);
      arrayOfObject1[1] = this.fHb;
      z.i("!32@/B4Tb64lLpLlVGlG0LwhNkUNSz1Jl26Q", "play completion mp:%d  path:%s", arrayOfObject1);
      try
      {
        this.iFe.close();
        if (paramMediaPlayer != null)
          paramMediaPlayer.release();
        if (this.iFf != null)
          this.iFf.te();
        return;
        j = paramMediaPlayer.hashCode();
      }
      catch (Exception localException)
      {
        arrayOfObject2 = new Object[3];
        if (paramMediaPlayer != null);
      }
    }
    while (true)
    {
      arrayOfObject2[0] = Integer.valueOf(i);
      arrayOfObject2[1] = this.fHb;
      arrayOfObject2[2] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLlVGlG0LwhNkUNSz1Jl26Q", "play mp:%d fd close failed path:%s e:%s", arrayOfObject2);
      break;
      i = paramMediaPlayer.hashCode();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bm
 * JD-Core Version:    0.6.2
 */