package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.tools.ei;
import java.util.List;

public final class ng
{
  public static void a(ar paramar, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptVoiceConnector: context is null");
      return;
    }
    if (paramar == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptVoiceConnector: msg is null");
      return;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramContext);
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptVoiceConnector: sd card not available");
      return;
    }
    a(aa.uY().dk(2), paramContext, new nk(paramar, paramContext));
  }

  public static void a(ar paramar, String paramString, Context paramContext)
  {
    a(paramar, paramString, paramContext, 512);
  }

  private static void a(ar paramar, String paramString, Context paramContext, int paramInt)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptMusicConnector: context is null");
      return;
    }
    if (paramar == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptMusicConnector: msg is null");
      return;
    }
    List localList = null;
    switch (paramInt)
    {
    default:
    case 256:
    case 128:
    case 512:
    }
    while (true)
    {
      a(localList, paramContext, new nr(paramar, paramString, paramInt, paramContext));
      return;
      localList = aa.uY().dk(256);
      continue;
      localList = r.uP();
      continue;
      localList = aa.uY().dk(512);
    }
  }

  private static void a(List paramList, Context paramContext, cm paramcm)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "tryShowConnectorDialog: careList is null or empty");
      return;
    }
    ei localei = new ei(paramContext);
    localei.a(new ns());
    localei.a(new ni(paramContext));
    localei.a(new nj(paramList));
    localei.b(paramcm);
    localei.baG();
  }

  public static void b(ar paramar, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptImgConnector: context is null");
      return;
    }
    if (paramar == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptImgConnector: msg is null");
      return;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramContext);
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptImgConnector: sd card is not available");
      return;
    }
    a(aa.uY().dk(4), paramContext, new nl(paramar, paramContext));
  }

  public static void b(ar paramar, String paramString, Context paramContext)
  {
    a(paramar, paramString, paramContext, 256);
  }

  public static void c(ar paramar, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptVideoConnector: context is null");
      return;
    }
    if (paramar == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptVideoConnector: msg is null");
      return;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramContext);
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptVideoConnector: sd card is not available");
      return;
    }
    a(aa.uY().dk(8), paramContext, new nm(paramar, paramContext));
  }

  public static void c(ar paramar, String paramString, Context paramContext)
  {
    a(paramar, paramString, paramContext, 128);
  }

  public static void d(ar paramar, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptEmojiConnector: context is null");
      return;
    }
    if (paramar == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptEmojiConnector: msg is null");
      return;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramContext);
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptEmojiConnector: sd card is not available");
      return;
    }
    a(aa.uY().dk(64), paramContext, new nq(paramar, paramContext));
  }

  public static void m(String paramString, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptTextConnector: context is null");
      return;
    }
    if (ch.jb(paramString))
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptTextConnector: content is null");
      return;
    }
    a(aa.uY().dk(1), paramContext, new nh(paramString, paramContext));
  }

  public static void n(String paramString, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptLocationConnector: context is null");
      return;
    }
    if (ch.jb(paramString))
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptLocationConnector: locationXML is null");
      return;
    }
    a(aa.uY().dk(16), paramContext, new no(paramString, paramContext));
  }

  public static void o(String paramString, Context paramContext)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptPersonalCardConnector: context is null");
      return;
    }
    if (ch.jb(paramString))
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptPersonalCardConnector: locationXML is null");
      return;
    }
    a(aa.uY().dk(32), paramContext, new np(paramString, paramContext));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ng
 * JD-Core Version:    0.6.2
 */