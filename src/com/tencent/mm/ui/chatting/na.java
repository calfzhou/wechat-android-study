package com.tencent.mm.ui.chatting;

import android.app.Activity;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.c.a.iz;
import com.tencent.mm.c.a.ja;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.tools.ImageGalleryUI;
import com.tencent.mm.ui.tools.ck;
import com.tencent.mm.ui.video.VideoDownloadUI;
import com.tencent.mm.ui.video.VideoPlayerUI;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.h;
import com.tencent.mm.y.l;

public final class na extends g
{
  private Activity cHB = null;
  private int jvq = 0;

  public na(int paramInt, Activity paramActivity)
  {
    super(0);
    this.jvq = paramInt;
    this.cHB = paramActivity;
  }

  private void Cs(String paramString)
  {
    com.tencent.mm.ui.base.e.a(this.cHB, paramString, "", false, new nc(this));
  }

  private static void ab(ar paramar)
  {
    q localq = v.ij(paramar.kp());
    String str;
    if (localq != null)
      str = i.a("downvideo", localq.kn(), localq.getUser(), localq.getFileName());
    try
    {
      k.vl().fP(str);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(true);
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", "[oneliang][revokeMsgVideo] cancel result:%s", arrayOfObject2);
      m.AM().CQ();
      m.AL().hZ(localq.getFileName());
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      com.tencent.mm.sdk.platformtools.z.printErrStackTrace("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", localException, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", arrayOfObject1);
    }
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    long l;
    String str1;
    ar localar;
    if ((this.jvq != 0) && (parame != null) && ((parame instanceof iz)))
    {
      iz localiz = (iz)parame;
      l = localiz.cNk.cDM;
      str1 = localiz.cNk.cNl;
      localar = bg.qW().oV().cV(l);
      switch (localar.getType())
      {
      default:
      case 3:
      case 43:
      case 62:
      }
    }
    while (true)
    {
      return false;
      switch (nd.jvs[(-1 + this.jvq)])
      {
      default:
        return false;
      case 1:
      }
      String str3;
      if (localar.kk() > 0L)
        str3 = i.a("downimg", localar.kn(), localar.kt(), localar.kk());
      try
      {
        k.vl().fP(str3);
        Object[] arrayOfObject7 = new Object[1];
        arrayOfObject7[0] = Boolean.valueOf(true);
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", "[oneliang][revokeMsgImage] cancel result:%s", arrayOfObject7);
        bg.qX().cancel(109);
        l locall = ck.ah(localar);
        ap.yh().a(locall.xM(), l);
        if ((this.cHB == null) || (!(this.cHB instanceof ImageGalleryUI)))
          continue;
        ImageGalleryUI localImageGalleryUI2 = (ImageGalleryUI)this.cHB;
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = Long.valueOf(l);
        arrayOfObject5[1] = Long.valueOf(localImageGalleryUI2.kk());
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", "[oneliang][revokeMsgImage] image gallery ui,msg id is:%s,downloadingImageMsgId: %s", arrayOfObject5);
        if (l != localImageGalleryUI2.kk())
          continue;
        com.tencent.mm.ui.base.e.a(this.cHB, str1, "", false, new nb(this));
        return false;
      }
      catch (Exception localException2)
      {
        while (true)
        {
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = localException2.getMessage();
          com.tencent.mm.sdk.platformtools.z.printErrStackTrace("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", localException2, "[oneliang][revokeMsgImage] cancel failure:%s", arrayOfObject6);
        }
      }
      switch (nd.jvs[(-1 + this.jvq)])
      {
      default:
        return false;
      case 2:
        ab(localar);
        if ((this.cHB instanceof ImageGalleryUI))
        {
          ImageGalleryUI localImageGalleryUI1 = (ImageGalleryUI)this.cHB;
          if (localImageGalleryUI1.ai(localar))
          {
            localImageGalleryUI1.re(localImageGalleryUI1.W());
            Cs(str1);
            return false;
          }
        }
        break;
      case 3:
        if ((this.cHB != null) && ((this.cHB instanceof VideoPlayerUI)))
        {
          VideoPlayerUI localVideoPlayerUI = (VideoPlayerUI)this.cHB;
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = Long.valueOf(l);
          arrayOfObject4[1] = Long.valueOf(localVideoPlayerUI.kk());
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", "[oneliang][revokeMsgVideo] video player ui,msg id is:%s,playingVideoMsgId: %s", arrayOfObject4);
          if (l == localVideoPlayerUI.kk())
          {
            Cs(str1);
            return false;
          }
        }
        break;
      case 4:
        q localq = v.ij(localar.kp());
        if (localq != null)
        {
          String str2 = i.a("downvideo", localq.kn(), localq.getUser(), localq.getFileName());
          try
          {
            k.vl().fP(str2);
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = Boolean.valueOf(true);
            com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", "[oneliang][revokeMsgVideo] video download ui,cancel result:%s", arrayOfObject3);
            m.AM().CQ();
            m.AL().hZ(localq.getFileName());
            if ((this.cHB != null) && ((this.cHB instanceof VideoDownloadUI)))
            {
              VideoDownloadUI localVideoDownloadUI = (VideoDownloadUI)this.cHB;
              Object[] arrayOfObject2 = new Object[2];
              arrayOfObject2[0] = Long.valueOf(l);
              arrayOfObject2[1] = Long.valueOf(localVideoDownloadUI.kk());
              com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", "[oneliang][revokeMsgVideo] msg id is:%s,downloadingVideoMsgId: %s", arrayOfObject2);
              if (l == localVideoDownloadUI.kk())
              {
                Cs(str1);
                return false;
              }
            }
          }
          catch (Exception localException1)
          {
            while (true)
            {
              Object[] arrayOfObject1 = new Object[1];
              arrayOfObject1[0] = localException1.getMessage();
              com.tencent.mm.sdk.platformtools.z.printErrStackTrace("!44@/B4Tb64lLpLvj7Df3Bvn5xYnbkX/ygtwaXm7+WPl0ys=", localException1, "[oneliang][revokeMsgVideo] cancel failure:%s", arrayOfObject1);
            }
          }
        }
        break;
      case 5:
      }
    }
    ab(localar);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.na
 * JD-Core Version:    0.6.2
 */