package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.sdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.sdk.modelmsg.WXEmojiObject;
import com.tencent.mm.sdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.sdk.modelmsg.WXFileObject;
import com.tencent.mm.sdk.modelmsg.WXImageObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.WXMusicObject;
import com.tencent.mm.sdk.modelmsg.WXTextObject;
import com.tencent.mm.sdk.modelmsg.WXVideoObject;
import com.tencent.mm.sdk.modelmsg.WXWebpageObject;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.n;

public final class s
{
  public static void C(ar paramar)
  {
    com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(paramar.getContent());
    if (localb1 == null)
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "resend app message error: app content null");
      return;
    }
    a locala = bf.GP().uU(localb1.dQY);
    String str1 = "";
    if ((locala != null) && (locala.field_fileFullPath != null) && (!locala.field_fileFullPath.equals("")))
    {
      str1 = bg.qW().po() + "da_" + ch.CM();
      com.tencent.mm.sdk.platformtools.p.f(locala.field_fileFullPath, str1, false);
    }
    String str2 = paramar.kp();
    Object localObject = null;
    String str3;
    if (str2 != null)
    {
      boolean bool = paramar.kp().equals("");
      localObject = null;
      if (!bool)
        str3 = ap.yg().gS(paramar.kp());
    }
    try
    {
      byte[] arrayOfByte = c.a(str3, 0, c.ab(str3));
      localObject = arrayOfByte;
      com.tencent.mm.ai.b localb2 = com.tencent.mm.ai.b.a(localb1);
      a(localb2, localb1.appName, paramar.kt(), str1, localObject);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        localObject = null;
    }
  }

  public static int a(com.tencent.mm.ai.b paramb, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    String str1 = System.currentTimeMillis();
    boolean bool1 = ch.jb(paramString3);
    a locala = null;
    if (!bool1)
    {
      locala = a(str1, paramb, paramString3);
      if (locala == null)
        return 0 - k.nJ();
    }
    ar localar = new ar();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      if (paramb.type != 2)
        break label337;
    long l;
    label337: for (boolean bool2 = true; ; bool2 = false)
    {
      String str2 = ap.yg().a(paramArrayOfByte, bool2, Bitmap.CompressFormat.PNG);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " thumbData MsgInfo path:" + str2);
      if (!ch.jb(str2))
      {
        localar.bK(str2);
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "new thumbnail saved, path" + str2);
      }
      if (locala != null)
        paramb.dQY = locala.iGx;
      localar.setContent(com.tencent.mm.ai.b.b(paramb));
      localar.setStatus(1);
      localar.bJ(paramString2);
      localar.q(bw.eo(paramString2));
      localar.bv(1);
      localar.setType(m(paramb.type, paramb.cCB, paramb.dRo));
      l = bg.qW().oV().y(localar);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " msginfo insert id: " + l);
      if (l >= 0L)
        break;
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + "insert msg failed :" + l);
      return 0 - k.nJ();
    }
    z.i("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nJ() + " new msg inserted to db , local id = " + l);
    localar.o(l);
    com.tencent.mm.ai.a locala1 = new com.tencent.mm.ai.a();
    locala1.field_xml = localar.getContent();
    locala1.field_title = paramb.title;
    locala1.field_type = paramb.type;
    locala1.field_description = paramb.description;
    locala1.field_msgId = l;
    locala1.field_source = paramString1;
    bf.GN().b(locala1);
    if (locala != null)
    {
      locala.field_msgInfoId = l;
      locala.field_status = 101L;
      bf.GP().a(locala, new String[0]);
      bf.azb().run();
      return 0;
    }
    bf.azb();
    bb.cr(l);
    return 0;
  }

  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    com.tencent.mm.ai.b localb = new com.tencent.mm.ai.b();
    localb.appId = paramString1;
    localb.appName = paramString2;
    localb.dRa = paramInt;
    String str1 = a(localb, paramWXMediaMessage, paramString4);
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " content url:" + localb.url + " lowUrl:" + localb.dQV + " attachlen:" + localb.dQW + " attachid:" + localb.dQY + " attach file:" + str1);
    String str2 = System.currentTimeMillis();
    boolean bool1 = ch.jb(str1);
    a locala = null;
    if (!bool1)
    {
      locala = a(str2, localb, str1);
      if (locala == null)
        return 0 - k.nJ();
    }
    ar localar = new ar();
    boolean bool2;
    if ((paramWXMediaMessage.thumbData != null) && (paramWXMediaMessage.thumbData.length > 0))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramWXMediaMessage.thumbData.length);
      z.v("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "appmsg.thumbData.length = %d", arrayOfObject);
      if (paramWXMediaMessage.thumbData.length <= 32768)
        break label530;
      if (localb.type != 2)
        break label524;
      bool2 = true;
    }
    long l;
    label524: label530: for (String str3 = ap.yg().a(paramWXMediaMessage.thumbData, bool2, Bitmap.CompressFormat.JPEG); ; str3 = ap.yg().t(paramWXMediaMessage.thumbData))
    {
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " thumbData MsgInfo path:" + str3);
      if (!ch.jb(str3))
      {
        localar.bK(str3);
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "new thumbnail saved, path" + str3);
      }
      if (locala != null)
        localb.dQY = locala.iGx;
      localb.dQZ = paramString4;
      localar.setContent(com.tencent.mm.ai.b.b(localb));
      localar.setStatus(1);
      localar.bJ(paramString3);
      localar.q(bw.eo(paramString3));
      localar.bv(1);
      localar.setType(m(localb.type, localb.cCB, localb.dRo));
      l = bg.qW().oV().y(localar);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " msginfo insert id: " + l);
      if (l >= 0L)
        break label545;
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + "insert msg failed :" + l);
      return 0 - k.nJ();
      bool2 = false;
      break;
    }
    label545: z.i("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nJ() + " new msg inserted to db , local id = " + l);
    localar.o(l);
    com.tencent.mm.ai.a locala1 = new com.tencent.mm.ai.a();
    locala1.field_xml = localar.getContent();
    locala1.field_title = paramWXMediaMessage.title;
    locala1.field_type = paramWXMediaMessage.mediaObject.type();
    locala1.field_description = paramWXMediaMessage.description;
    locala1.field_msgId = l;
    locala1.field_source = paramString2;
    bf.GN().b(locala1);
    if (locala != null)
    {
      locala.field_msgInfoId = l;
      locala.field_status = 101L;
      bf.GP().a(locala, new String[0]);
      bf.azb().run();
      return 0;
    }
    bf.azb();
    bb.cr(l);
    return 0;
  }

  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    com.tencent.mm.ai.b localb = new com.tencent.mm.ai.b();
    localb.appId = paramString1;
    localb.appName = paramString2;
    localb.dRa = paramInt;
    localb.cNM = paramString4;
    localb.cNN = paramString5;
    String str1 = a(localb, paramWXMediaMessage, null);
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " content url:" + localb.url + " lowUrl:" + localb.dQV + " attachlen:" + localb.dQW + " attachid:" + localb.dQY + " attach file:" + str1);
    String str2 = System.currentTimeMillis();
    boolean bool1 = ch.jb(str1);
    a locala = null;
    if (!bool1)
    {
      locala = a(str2, localb, str1);
      if (locala == null)
        return 0 - k.nJ();
    }
    ar localar = new ar();
    if ((paramWXMediaMessage.thumbData != null) && (paramWXMediaMessage.thumbData.length > 0))
      if (localb.type != 2)
        break label491;
    long l;
    label491: for (boolean bool2 = true; ; bool2 = false)
    {
      String str3 = ap.yg().a(paramWXMediaMessage.thumbData, bool2, Bitmap.CompressFormat.PNG);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " thumbData MsgInfo path:" + str3);
      if (!ch.jb(str3))
      {
        localar.bK(str3);
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "new thumbnail saved, path" + str3);
      }
      if (locala != null)
        localb.dQY = locala.iGx;
      localar.setContent(com.tencent.mm.ai.b.b(localb));
      localar.setStatus(1);
      localar.bJ(paramString3);
      localar.q(bw.eo(paramString3));
      localar.bv(1);
      localar.setType(m(localb.type, localb.cCB, localb.dRo));
      l = bg.qW().oV().y(localar);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " msginfo insert id: " + l);
      if (l >= 0L)
        break;
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + "insert msg failed :" + l);
      return 0 - k.nJ();
    }
    z.i("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nJ() + " new msg inserted to db , local id = " + l);
    localar.o(l);
    com.tencent.mm.ai.a locala1 = new com.tencent.mm.ai.a();
    locala1.field_xml = localar.getContent();
    locala1.field_title = paramWXMediaMessage.title;
    locala1.field_type = paramWXMediaMessage.mediaObject.type();
    locala1.field_description = paramWXMediaMessage.description;
    locala1.field_msgId = l;
    locala1.field_source = paramString2;
    bf.GN().b(locala1);
    if (locala != null)
    {
      locala.field_msgInfoId = l;
      locala.field_status = 101L;
      bf.GP().a(locala, new String[0]);
      bf.azb().run();
      return 0;
    }
    bf.azb();
    bb.cr(l);
    return 0;
  }

  private static a a(String paramString1, com.tencent.mm.ai.b paramb, String paramString2)
  {
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " buildUploadAttachInfo clientAppDataId:" + paramString1 + " attach file :" + paramString2);
    String str = paramString2.replace("//", "/");
    if (str.startsWith(com.tencent.mm.storage.h.ihY))
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "Error attach path:%s", new Object[] { str });
      return null;
    }
    a locala = new a();
    locala.field_totalLen = paramb.dQW;
    locala.field_fileFullPath = paramString2;
    locala.field_sdkVer = paramb.sdkVer;
    locala.field_appId = paramb.appId;
    locala.field_clientAppDataId = paramString1;
    locala.field_type = paramb.type;
    locala.field_status = 200L;
    locala.field_isUpload = true;
    locala.field_createTime = ch.CM();
    locala.field_lastModifyTime = ch.CL();
    locala.field_mediaSvrId = ch.CM();
    bf.GP().b(locala);
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " buildUploadAttachInfo file:" + paramString2 + " rowid:" + locala.iGx);
    if (locala.iGx < 0L)
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " uploadAttach insert appattach info failed :" + locala.iGx);
      return null;
    }
    return locala;
  }

  private static String a(com.tencent.mm.ai.b paramb, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + "mediaMessageToContent sdkver:" + paramWXMediaMessage.sdkVer + " title:" + paramWXMediaMessage.title + " desc:" + paramWXMediaMessage.description + " type:" + paramWXMediaMessage.mediaObject.type());
    paramb.sdkVer = paramWXMediaMessage.sdkVer;
    paramb.title = paramWXMediaMessage.title;
    paramb.description = paramWXMediaMessage.description;
    paramb.mediaTagName = paramWXMediaMessage.mediaTagName;
    paramb.messageAction = paramWXMediaMessage.messageAction;
    paramb.messageExt = paramWXMediaMessage.messageExt;
    com.tencent.mm.sdk.modelmsg.p localp = paramWXMediaMessage.mediaObject;
    paramb.type = localp.type();
    if (paramb.type == 7)
    {
      WXAppExtendObject localWXAppExtendObject = (WXAppExtendObject)localp;
      paramb.extInfo = localWXAppExtendObject.extInfo;
      if (!ch.B(localWXAppExtendObject.fileData))
      {
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " fileData:" + localWXAppExtendObject.fileData.length);
        paramb.dQW = localWXAppExtendObject.fileData.length;
        return aM(localWXAppExtendObject.fileData);
      }
      paramb.dQW = c.ab(localWXAppExtendObject.filePath);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " read file:" + localWXAppExtendObject.filePath + " len:" + paramb.dQW);
      if (paramb.dQW > 0)
      {
        paramb.dQX = c.ad(localWXAppExtendObject.filePath);
        return localWXAppExtendObject.filePath;
      }
      return null;
    }
    if (paramb.type == 6)
    {
      WXFileObject localWXFileObject = (WXFileObject)localp;
      if (!ch.B(localWXFileObject.fileData))
      {
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " fileData:" + localWXFileObject.fileData.length);
        paramb.dQW = localWXFileObject.fileData.length;
        return aM(localWXFileObject.fileData);
      }
      paramb.dQW = c.ab(localWXFileObject.filePath);
      z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " read file:" + localWXFileObject.filePath + " len:" + paramb.dQW);
      if (paramb.dQW > 0)
      {
        paramb.dQX = c.ad(localWXFileObject.filePath);
        return localWXFileObject.filePath;
      }
      return null;
    }
    if (paramb.type == 2)
    {
      WXImageObject localWXImageObject = (WXImageObject)localp;
      if (!ch.B(localWXImageObject.imageData))
      {
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " fileData:" + localWXImageObject.imageData.length);
        paramb.dQW = localWXImageObject.imageData.length;
        return aM(localWXImageObject.imageData);
      }
      if (!ch.jb(localWXImageObject.imagePath))
      {
        paramb.dQW = c.ab(localWXImageObject.imagePath);
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " read file:" + localWXImageObject.imagePath + " len:" + paramb.dQW);
        if (paramb.dQW > 0)
        {
          paramb.dQX = c.ad(localWXImageObject.imagePath);
          return localWXImageObject.imagePath;
        }
        return null;
      }
      paramb.url = localWXImageObject.imageUrl;
      return null;
    }
    if (paramb.type == 3)
    {
      WXMusicObject localWXMusicObject = (WXMusicObject)localp;
      paramb.url = localWXMusicObject.musicUrl;
      paramb.dQV = localWXMusicObject.musicLowBandUrl;
      paramb.dRl = localWXMusicObject.musicDataUrl;
      paramb.dRm = localWXMusicObject.musicLowBandDataUrl;
      return null;
    }
    if (paramb.type == 4)
    {
      WXVideoObject localWXVideoObject = (WXVideoObject)localp;
      paramb.url = localWXVideoObject.videoUrl;
      paramb.dQV = localWXVideoObject.videoLowBandUrl;
      return null;
    }
    if (paramb.type == 5)
    {
      WXWebpageObject localWXWebpageObject = (WXWebpageObject)localp;
      paramb.url = localWXWebpageObject.webpageUrl;
      if (!ch.jb(localWXWebpageObject.extInfo))
        paramb.extInfo = localWXWebpageObject.extInfo;
      return null;
    }
    if (paramb.type == 1)
    {
      paramb.title = ((WXTextObject)localp).text;
      return null;
    }
    if (paramb.type == 8)
    {
      WXEmojiObject localWXEmojiObject = (WXEmojiObject)localp;
      if (!ch.B(localWXEmojiObject.emojiData))
      {
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " fileData:" + localWXEmojiObject.emojiData.length);
        paramb.dQW = localWXEmojiObject.emojiData.length;
        return aM(localWXEmojiObject.emojiData);
      }
      if (!ch.jb(localWXEmojiObject.emojiPath))
      {
        paramb.dQW = c.ab(localWXEmojiObject.emojiPath);
        z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " read file:" + localWXEmojiObject.emojiPath + " len:" + paramb.dQW);
        if (paramb.dQW > 0)
        {
          paramb.dQX = c.ad(localWXEmojiObject.emojiPath);
          return localWXEmojiObject.emojiPath;
        }
        return null;
      }
      paramb.dQZ = paramString;
    }
    do
    {
      return null;
      if (paramb.type == 15)
      {
        WXEmojiSharedObject localWXEmojiSharedObject2 = (WXEmojiSharedObject)localp;
        paramb.thumburl = localWXEmojiSharedObject2.thumburl;
        paramb.dRy = localWXEmojiSharedObject2.packageflag;
        paramb.dRx = localWXEmojiSharedObject2.packageid;
        paramb.cCB = 8;
        paramb.url = localWXEmojiSharedObject2.url;
        return null;
      }
    }
    while (paramb.type != 13);
    WXEmojiSharedObject localWXEmojiSharedObject1 = (WXEmojiSharedObject)localp;
    paramb.thumburl = localWXEmojiSharedObject1.thumburl;
    paramb.dRy = localWXEmojiSharedObject1.packageflag;
    paramb.dRx = localWXEmojiSharedObject1.packageid;
    paramb.cCB = 8;
    paramb.url = localWXEmojiSharedObject1.url;
    return null;
  }

  public static String a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    a locala = new a();
    locala.field_fileFullPath = paramString1;
    locala.field_appId = paramString2;
    locala.field_sdkVer = paramInt1;
    locala.field_mediaSvrId = paramString3;
    locala.field_totalLen = paramInt2;
    locala.field_status = 101L;
    locala.field_isUpload = false;
    locala.field_createTime = ch.CM();
    locala.field_lastModifyTime = ch.CL();
    locala.field_msgInfoId = paramLong;
    locala.field_netTimes = 0L;
    bf.GP().b(locala);
    return paramString3;
  }

  private static String aM(byte[] paramArrayOfByte)
  {
    if (ch.B(paramArrayOfByte))
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " attachBuf is null");
      return null;
    }
    String str = bg.qW().po() + "ua_" + ch.CM();
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " buildUploadAttachInfo file:" + str);
    if (c.a(str, paramArrayOfByte, paramArrayOfByte.length) != 0)
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " writeFile error file:" + str);
      return null;
    }
    return str;
  }

  public static a b(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    a locala = new a();
    locala.field_fileFullPath = paramString1;
    locala.field_appId = paramString2;
    locala.field_sdkVer = paramInt1;
    locala.field_mediaSvrId = paramString3;
    locala.field_totalLen = paramInt2;
    locala.field_status = 101L;
    locala.field_isUpload = false;
    locala.field_createTime = ch.CM();
    locala.field_lastModifyTime = ch.CL();
    locala.field_msgInfoId = paramLong;
    locala.field_netTimes = 0L;
    return locala;
  }

  public static String b(long paramLong, String paramString1, String paramString2)
  {
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(paramString1);
    if (localb == null)
      return null;
    String str2;
    if (paramString2 != null)
    {
      str2 = paramString2;
      return a(str2, paramLong, localb.sdkVer, localb.appId, localb.dQY, localb.dQW);
    }
    StringBuilder localStringBuilder = new StringBuilder().append(com.tencent.mm.compatible.g.h.dOJ);
    if (ch.ja(localb.title).length() > 0);
    for (String str1 = localb.title; ; str1 = "da_" + ch.CM())
    {
      str2 = str1;
      if (c.ac(str2))
        str2 = com.tencent.mm.compatible.g.h.dOJ + ch.CL() + localb.title;
      if ((ch.jb(localb.dQX)) || (str2.endsWith(localb.dQX)))
        break;
      str2 = str2 + "." + localb.dQX;
      break;
    }
  }

  public static void cq(long paramLong)
  {
    bf.GP().cn(paramLong);
    a locala = new a();
    bf.GP().b(paramLong, locala);
    if (locala.field_msgInfoId <= 0L);
    ar localar;
    do
    {
      return;
      localar = bg.qW().oV().cV(locala.field_msgInfoId);
    }
    while (localar.kk() != locala.field_msgInfoId);
    localar.setStatus(5);
    bg.qW().oV().a(localar.kk(), localar);
  }

  public static int g(long paramLong, String paramString)
  {
    ar localar = bg.qW().oV().cV(paramLong);
    if (localar.kk() != paramLong)
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " getmsgFailed id:" + paramLong);
      return 0 - k.nJ();
    }
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(localar.getContent());
    if (localb == null)
    {
      z.e("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", k.nL() + " getmsgFailed id:" + paramLong);
      return 0 - k.nJ();
    }
    localb.dQY = paramString;
    localar.setContent(com.tencent.mm.ai.b.b(localb));
    bg.qW().oV().a(localar.kk(), localar);
    com.tencent.mm.ai.a locala = bf.GN().cp(paramLong);
    locala.field_xml = localar.getContent();
    bf.GN().a(locala, new String[] { "msgId" });
    a locala1 = bf.GP().co(paramLong);
    locala1.field_mediaSvrId = paramString;
    locala1.field_offset = locala1.field_totalLen;
    bf.GP().a(locala1, new String[0]);
    return 0;
  }

  public static int m(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -1879048185;
    z.d("!32@/B4Tb64lLpJ6sk5Ca9iJZZMT3XTYi1Xb", "getLocalAppMsgType showType " + paramInt2 + " atype " + paramInt1 + ", itemShowType = " + paramInt3);
    if (paramInt3 == 4)
      i = 318767153;
    do
    {
      return i;
      switch (paramInt2)
      {
      default:
        switch (paramInt1)
        {
        case 21:
        default:
          return 49;
        case 2:
        case 1:
        case 8:
        case 10:
        case 20:
        case 13:
        case 17:
        case 2000:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 17:
      }
    }
    while (paramInt1 == 21);
    return 285212721;
    return 301989937;
    return -1879048189;
    return -1879048190;
    return -1879048191;
    return -1879048186;
    return 268435505;
    return 16777265;
    return 1048625;
    return 335544369;
    return 402653233;
    return 369098801;
    return -1879048186;
    return 419430449;
  }

  public static int mo(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return paramInt;
    case -1879048191:
    case -1879048190:
    case -1879048189:
    case -1879048186:
    case -1879048185:
    case 1048625:
    case 16777265:
    case 268435505:
    case 285212721:
    case 301989937:
    case 335544369:
    case 402653233:
    }
    return 49;
  }

  public static boolean va(String paramString)
  {
    if (ch.jb(paramString));
    while (paramString.equals("0:0"))
      return false;
    return true;
  }

  public static void vb(String paramString)
  {
    a locala = bf.GP().uU(paramString);
    if (locala != null)
    {
      c.deleteFile(locala.field_fileFullPath);
      bf.GP().b(locala, new String[] { "mediaId" });
    }
  }

  public static int vc(String paramString)
  {
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(paramString);
    if (localb == null)
      return -1;
    if (!va(localb.dQY))
      return -1;
    a locala = new a();
    long l = ch.getLong(localb.dQY, -1L);
    if (l != -1L)
    {
      bf.GP().b(l, locala);
      if (locala.iGx != l)
      {
        locala = bf.GP().uU(localb.dQY);
        if ((locala == null) || (!locala.field_mediaSvrId.equals(localb.dQY)))
          return -1;
      }
    }
    else
    {
      locala = bf.GP().uU(localb.dQY);
      if ((locala == null) || (!locala.field_mediaSvrId.equals(localb.dQY)))
        return -1;
    }
    if (locala.field_totalLen == 0L)
      return -1;
    return (int)(100L * locala.field_offset / locala.field_totalLen);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.s
 * JD-Core Version:    0.6.2
 */