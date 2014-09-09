package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;

public final class bl
{
  public static void a(Context paramContext, int paramInt, bn parambn)
  {
    a(paramContext, paramInt, bo.iFh, false, parambn);
  }

  private static void a(Context paramContext, int paramInt, bo parambo, boolean paramBoolean, bn parambn)
  {
    if ((paramContext == null) || (parambo == null))
    {
      Object[] arrayOfObject1 = new Object[5];
      arrayOfObject1[0] = paramContext;
      arrayOfObject1[1] = Integer.valueOf(paramInt);
      arrayOfObject1[2] = parambo;
      arrayOfObject1[3] = Boolean.valueOf(false);
      arrayOfObject1[4] = parambn;
      z.e("!32@/B4Tb64lLpLlVGlG0LwhNkUNSz1Jl26Q", "play Err context:%s pathId:%d speekeron:%s looping:%b listener:%s", arrayOfObject1);
      return;
    }
    String str = paramContext.getString(paramInt);
    MediaPlayer localMediaPlayer = new MediaPlayer();
    if (parambo != bo.iFg)
      if (parambo != bo.iFh)
        break label264;
    label264: for (int i = 3; ; i = 0)
    {
      localMediaPlayer.setAudioStreamType(i);
      Object[] arrayOfObject2 = new Object[7];
      arrayOfObject2[0] = Integer.valueOf(localMediaPlayer.hashCode());
      arrayOfObject2[1] = str;
      arrayOfObject2[2] = paramContext;
      arrayOfObject2[3] = Integer.valueOf(paramInt);
      arrayOfObject2[4] = parambo;
      arrayOfObject2[5] = Boolean.valueOf(false);
      arrayOfObject2[6] = parambn;
      z.i("!32@/B4Tb64lLpLlVGlG0LwhNkUNSz1Jl26Q", "play start mp:%d path:%s context:%s pathId:%d speekeron:%s looping:%b listener:%s ", arrayOfObject2);
      try
      {
        AssetFileDescriptor localAssetFileDescriptor = paramContext.getAssets().openFd(str);
        localMediaPlayer.setDataSource(localAssetFileDescriptor.getFileDescriptor(), localAssetFileDescriptor.getStartOffset(), localAssetFileDescriptor.getLength());
        localMediaPlayer.prepare();
        localMediaPlayer.setLooping(false);
        localMediaPlayer.start();
        localMediaPlayer.setOnCompletionListener(new bm(str, localAssetFileDescriptor, parambn));
        return;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(paramInt);
        arrayOfObject3[1] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLlVGlG0LwhNkUNSz1Jl26Q", "play failed pathId:%d e:%s", arrayOfObject3);
        return;
      }
    }
  }

  public static void a(Context paramContext, int paramInt, boolean paramBoolean, bn parambn)
  {
    if (paramBoolean);
    for (bo localbo = bo.iFh; ; localbo = bo.iFi)
    {
      a(paramContext, paramInt, localbo, false, parambn);
      return;
    }
  }

  public static void b(Context paramContext, int paramInt, bn parambn)
  {
    a(paramContext, paramInt, bo.iFg, false, parambn);
  }

  public static void z(Context paramContext, int paramInt)
  {
    a(paramContext, paramInt, bo.iFg, false, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bl
 * JD-Core Version:    0.6.2
 */