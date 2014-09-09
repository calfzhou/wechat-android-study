package com.tencent.mm.ai;

import android.util.Base64;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.q.h;
import com.tencent.mm.sdk.platformtools.cd;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class b
{
  private static final com.tencent.mm.a.d dju = new com.tencent.mm.a.d(100);
  public String appId;
  public String appName;
  public int cCB;
  public String cKk;
  public String cNM;
  public String cNN;
  public String content;
  public Map dQU;
  public String dQV;
  public int dQW;
  public String dQX;
  public String dQY;
  public String dQZ;
  public String dRA;
  public String dRB;
  public String dRC;
  public String dRD;
  public String dRE;
  public String dRF;
  public String dRG;
  public String dRH;
  public String dRI;
  public int dRJ;
  public int dRK;
  public int dRL;
  public String dRM;
  public String dRN;
  public String dRO;
  public int dRP;
  public int dRQ;
  public String dRR;
  public String dRS;
  public int dRT;
  public int dRU;
  public int dRa;
  public int dRb;
  public String dRc;
  public String dRd;
  public String dRg;
  public int dRh;
  public String dRi;
  public String dRj;
  public int dRk;
  public String dRl;
  public String dRm;
  public LinkedList dRn = null;
  public int dRo;
  public int dRp;
  public String dRq;
  public String dRr;
  public int dRs;
  public String dRt;
  public String dRu;
  public int dRv;
  public String dRw;
  public String dRx;
  public int dRy;
  public String dRz;
  public String ddY;
  public String description;
  public String diE;
  public String diG;
  public String extInfo;
  public String mediaTagName;
  public String messageAction;
  public String messageExt;
  public int sdkVer;
  public String thumburl;
  public String title;
  public int type;
  public String url;

  public static final b V(String paramString1, String paramString2)
  {
    b localb1;
    if (ch.jb(paramString1))
    {
      localb1 = null;
      return localb1;
    }
    int i = paramString1.indexOf('<');
    if (i > 0);
    for (String str1 = paramString1.substring(i); ; str1 = paramString1)
    {
      int j = str1.hashCode();
      localb1 = (b)dju.get(Integer.valueOf(j));
      if (localb1 != null)
        break;
      long l1 = System.currentTimeMillis();
      boolean bool = ch.jb(paramString2);
      Map localMap1 = null;
      if (!bool)
        localMap1 = cd.AW(paramString2);
      if (localMap1 == null);
      for (Map localMap2 = x.bB(str1, "msg"); ; localMap2 = localMap1)
      {
        if (localMap2 == null)
        {
          z.e("!32@/B4Tb64lLpJNEklygrV/uBb8s7Fi6nhV", "parse msg failed");
          return null;
        }
        long l2 = System.currentTimeMillis();
        while (true)
        {
          b localb2;
          try
          {
            localb2 = new b();
            localb2.dQU = localMap2;
            localb2.appId = ((String)localMap2.get(".msg.appmsg.$appid"));
            localb2.sdkVer = ch.getInt((String)localMap2.get(".msg.appmsg.$sdkver"), 0);
            localb2.title = ch.AX((String)localMap2.get(".msg.appmsg.title"));
            localb2.description = ((String)localMap2.get(".msg.appmsg.des"));
            localb2.diE = ((String)localMap2.get(".msg.appmsg.action"));
            localb2.type = ch.getInt((String)localMap2.get(".msg.appmsg.type"), 0);
            localb2.content = ((String)localMap2.get(".msg.appmsg.content"));
            localb2.url = ((String)localMap2.get(".msg.appmsg.url"));
            localb2.dQV = ((String)localMap2.get(".msg.appmsg.lowurl"));
            localb2.dRl = ((String)localMap2.get(".msg.appmsg.dataurl"));
            localb2.dRm = ((String)localMap2.get(".msg.appmsg.lowdataurl"));
            localb2.dQW = ch.getInt((String)localMap2.get(".msg.appmsg.appattach.totallen"), 0);
            localb2.dQY = ((String)localMap2.get(".msg.appmsg.appattach.attachid"));
            localb2.dQX = ch.AX((String)localMap2.get(".msg.appmsg.appattach.fileext"));
            localb2.dQZ = ((String)localMap2.get(".msg.appmsg.appattach.emoticonmd5"));
            localb2.extInfo = ((String)localMap2.get(".msg.appmsg.extinfo"));
            localb2.dRa = ch.getInt((String)localMap2.get(".msg.appmsg.androidsource"), 0);
            localb2.cNM = ((String)localMap2.get(".msg.appmsg.sourceusername"));
            localb2.cNN = ((String)localMap2.get(".msg.appmsg.sourcedisplayname"));
            localb2.ddY = ((String)localMap2.get(".msg.commenturl"));
            localb2.thumburl = ((String)localMap2.get(".msg.appmsg.thumburl"));
            localb2.mediaTagName = ((String)localMap2.get(".msg.appmsg.mediatagname"));
            localb2.messageAction = ((String)localMap2.get(".msg.appmsg.messageaction"));
            localb2.messageExt = ((String)localMap2.get(".msg.appmsg.messageext"));
            localb2.dRb = ch.getInt((String)localMap2.get(".msg.appinfo.version"), 0);
            localb2.appName = ((String)localMap2.get(".msg.appinfo.appname"));
            localb2.diG = ((String)localMap2.get(".msg.fromusername"));
            localb2.dRd = ((String)localMap2.get(".msg.appmsg.appattach.cdnattachurl"));
            localb2.dRg = ((String)localMap2.get(".msg.appmsg.appattach.cdnthumburl"));
            localb2.dRh = ch.getInt((String)localMap2.get(".msg.appmsg.appattach.cdnthumblength"), 0);
            localb2.dRi = ((String)localMap2.get(".msg.appmsg.appattach.aeskey"));
            localb2.dRk = ch.getInt((String)localMap2.get(".msg.appmsg.appattach.encryver"), 1);
            localb2.dRj = ((String)localMap2.get(".msg.appmsg.appattach.cdnthumbaeskey"));
            localb2.dRp = ch.getInt((String)localMap2.get(".msg.appmsg.productitem.$type"), 0);
            localb2.dRq = ((String)localMap2.get(".msg.appmsg.productitem.productinfo"));
            localb2.dRs = ch.getInt((String)localMap2.get(".msg.appmsg.emoticongift.packageflag"), 0);
            localb2.dRr = ((String)localMap2.get(".msg.appmsg.emoticongift.packageid"));
            localb2.dRx = ((String)localMap2.get(".msg.appmsg.emoticonshared.packageid"));
            localb2.dRy = ch.getInt((String)localMap2.get(".msg.appmsg.emoticonshared.packageflag"), 0);
            localb2.dRt = ((String)localMap2.get(".msg.appmsg.tvinfo"));
            localb2.dRu = ((String)localMap2.get(".msg.appmsg.recorditem"));
            switch (localb2.type)
            {
            default:
              localb2.cCB = ch.getInt((String)localMap2.get(".msg.appmsg.showtype"), 0);
              switch (localb2.cCB)
              {
              default:
                localb2.dRo = ch.getInt((String)localMap2.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
                localb2.dRz = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.ranktitle"));
                localb2.dRA = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.rankdisplay"));
                localb2.dRB = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoretitle"));
                localb2.dRC = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoredisplay"));
                localb2.dRD = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.tipdisplay"));
                localb2.dRE = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.color"));
                localb2.dRF = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightcolor"));
                localb2.dRG = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.linecolor"));
                localb2.dRH = ((String)localMap2.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightlinecolor"));
                localb2.dRI = ((String)localMap2.get(".msg.appmsg.hardwareinfo.rankview.rankviewtitle"));
                localb2.dRJ = ch.getInt((String)localMap2.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
                localb2.dRK = ch.getInt((String)localMap2.get(".msg.appmsg.template_id"), 0);
                dju.b(Integer.valueOf(j), localb2);
                Object[] arrayOfObject = new Object[3];
                arrayOfObject[0] = Long.valueOf(l2 - l1);
                arrayOfObject[1] = Long.valueOf(System.currentTimeMillis() - l1);
                arrayOfObject[2] = Integer.valueOf(ch.ja(paramString2).hashCode());
                z.d("!32@/B4Tb64lLpJNEklygrV/uBb8s7Fi6nhV", "parseContent, time:%d, %d, %d", arrayOfObject);
                return localb2;
              case 1:
              case 2:
              }
            case 13:
              localb2.dRv = ch.getInt((String)localMap2.get(".msg.appmsg.mallproductitem.$type"), 0);
              localb2.dRw = ((String)localMap2.get(".msg.appmsg.mallproductitem.mallproductinfo"));
              continue;
            case 2000:
            case 16:
            }
          }
          catch (Exception localException)
          {
            z.e("!32@/B4Tb64lLpJNEklygrV/uBb8s7Fi6nhV", "parse amessage xml failed");
            return null;
          }
          localb2.dRL = ch.getInt((String)localMap2.get(".msg.appmsg.wcpayinfo.paysubtype"), 0);
          localb2.dRM = ch.ja((String)localMap2.get(".msg.appmsg.wcpayinfo.feedesc"));
          localb2.dRN = ch.ja((String)localMap2.get(".msg.appmsg.wcpayinfo.transcationid"));
          localb2.dRO = ch.ja((String)localMap2.get(".msg.appmsg.wcpayinfo.transferid"));
          localb2.dRP = ch.getInt((String)localMap2.get(".msg.appmsg.wcpayinfo.invalidtime"), 0);
          localb2.dRQ = ch.getInt((String)localMap2.get(".msg.appmsg.wcpayinfo.effectivedate"), 3);
          localb2.cKk = paramString1;
          localb2.dRR = "";
          localb2.dRT = ch.getInt((String)localMap2.get(".msg.appmsg.carditem.from_scene"), 2);
          localb2.dRS = ((String)localMap2.get(".msg.appmsg.carditem.brand_name"));
          localb2.dRU = ch.getInt((String)localMap2.get(".msg.appmsg.carditem.card_type"), -1);
          continue;
          if (ch.getInt((String)localMap2.get(".msg.appmsg.mmreader.category.$count"), 0) > 0)
            localb2.content = cd.u(localMap2);
          localb2.dRn = h.d(localMap2);
          continue;
          String str2 = paramString1.toLowerCase();
          localb2.dRc = paramString1.substring(17 + str2.indexOf("<ShakePageResult>".toLowerCase()), str2.indexOf("</ShakePageResult>".toLowerCase()));
        }
      }
    }
  }

  public static b a(b paramb)
  {
    b localb = new b();
    if (paramb == null)
      return localb;
    localb.diE = paramb.diE;
    localb.appId = paramb.appId;
    localb.appName = paramb.appName;
    localb.dRb = paramb.dRb;
    localb.dQY = paramb.dQY;
    localb.dQW = paramb.dQW;
    localb.content = paramb.content;
    localb.description = paramb.description;
    localb.extInfo = paramb.extInfo;
    localb.mediaTagName = paramb.mediaTagName;
    localb.messageAction = paramb.messageAction;
    localb.messageExt = paramb.messageExt;
    localb.dRa = paramb.dRa;
    localb.dQX = paramb.dQX;
    localb.diG = paramb.diG;
    localb.dQV = paramb.dQV;
    localb.sdkVer = paramb.sdkVer;
    localb.title = paramb.title;
    localb.type = paramb.type;
    localb.cCB = paramb.cCB;
    localb.dRo = paramb.dRo;
    localb.url = paramb.url;
    localb.dQZ = paramb.dQZ;
    localb.cNM = paramb.cNM;
    localb.cNN = paramb.cNN;
    localb.ddY = paramb.ddY;
    localb.thumburl = paramb.thumburl;
    localb.dRc = paramb.dRc;
    localb.dRl = paramb.dRl;
    localb.dRm = paramb.dRm;
    localb.dRp = paramb.dRp;
    localb.dRq = paramb.dRq;
    localb.dRs = paramb.dRs;
    localb.dRr = paramb.dRr;
    localb.dRv = paramb.dRv;
    localb.dRw = paramb.dRw;
    localb.dRy = paramb.dRy;
    localb.dRx = paramb.dRx;
    localb.dRt = paramb.dRt;
    localb.dRu = paramb.dRu;
    localb.dRK = paramb.dRK;
    localb.cKk = paramb.cKk;
    localb.dRR = paramb.dRR;
    localb.dRS = paramb.dRS;
    localb.dRT = paramb.dRT;
    localb.dRU = paramb.dRT;
    localb.dRM = paramb.dRM;
    localb.dRP = paramb.dRP;
    localb.dRL = paramb.dRL;
    localb.dRN = paramb.dRN;
    localb.dRO = paramb.dRO;
    return localb;
  }

  public static String a(b paramb, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("<appmsg appid=\"" + ch.xv(paramb.appId) + "\" sdkver=\"" + paramb.sdkVer + "\">");
    localStringBuilder1.append("<title>" + ch.xv(paramb.title) + "</title>");
    localStringBuilder1.append("<des>" + ch.xv(paramb.description) + "</des>");
    StringBuilder localStringBuilder2 = new StringBuilder("<action>");
    String str;
    if (ch.jb(paramb.diE))
    {
      str = "view";
      localStringBuilder1.append(str + "</action>");
      localStringBuilder1.append("<type>" + paramb.type + "</type>");
      localStringBuilder1.append("<showtype>").append(paramb.cCB).append("</showtype>");
      localStringBuilder1.append("<content>" + ch.xv(paramb.content) + "</content>");
      localStringBuilder1.append("<url>" + ch.xv(paramb.url) + "</url>");
      localStringBuilder1.append("<lowurl>" + ch.xv(paramb.dQV) + "</lowurl>");
      localStringBuilder1.append("<dataurl>" + ch.xv(paramb.dRl) + "</dataurl>");
      localStringBuilder1.append("<lowdataurl>" + ch.xv(paramb.dRm) + "</lowdataurl>");
      switch (paramb.type)
      {
      default:
        label468: localStringBuilder1.append("<appattach>");
        if ((paramkeep_SceneResult == null) || ((ch.jb(paramString)) && (paramInt1 == 0) && (paramInt2 == 0)))
        {
          localStringBuilder1.append("<totallen>" + paramb.dQW + "</totallen>");
          localStringBuilder1.append("<attachid>" + ch.xv(paramb.dQY) + "</attachid>");
          localStringBuilder1.append("<emoticonmd5>" + ch.xv(paramb.dQZ) + "</emoticonmd5>");
          localStringBuilder1.append("<fileext>" + ch.xv(paramb.dQX) + "</fileext>");
        }
        break;
      case 10:
      case 13:
      case 20:
      case 19:
      case 16:
      case 2000:
      }
    }
    while (true)
    {
      localStringBuilder1.append("</appattach>");
      localStringBuilder1.append("<extinfo>" + ch.xv(paramb.extInfo) + "</extinfo>");
      localStringBuilder1.append("<androidsource>" + paramb.dRa + "</androidsource>");
      if (!ch.jb(paramb.cNM))
      {
        localStringBuilder1.append("<sourceusername>" + ch.xv(paramb.cNM) + "</sourceusername>");
        localStringBuilder1.append("<sourcedisplayname>" + ch.xv(paramb.cNN) + "</sourcedisplayname>");
        localStringBuilder1.append("<commenturl>" + ch.xv(paramb.ddY) + "</commenturl>");
      }
      localStringBuilder1.append("<thumburl>" + ch.xv(paramb.thumburl) + "</thumburl>");
      localStringBuilder1.append("<mediatagname>" + ch.xv(paramb.mediaTagName) + "</mediatagname>");
      localStringBuilder1.append("<messageaction>" + jk(ch.xv(paramb.messageAction)) + "</messageaction>");
      localStringBuilder1.append("<messageext>" + jk(ch.xv(paramb.messageExt)) + "</messageext>");
      localStringBuilder1.append("<emoticongift>");
      localStringBuilder1.append("<packageflag>" + paramb.dRs + "</packageflag>");
      localStringBuilder1.append("<packageid>" + ch.xv(paramb.dRr) + "</packageid>");
      localStringBuilder1.append("</emoticongift>");
      localStringBuilder1.append("<emoticonshared>");
      localStringBuilder1.append("<packageflag>" + paramb.dRy + "</packageflag>");
      localStringBuilder1.append("<packageid>" + ch.xv(paramb.dRx) + "</packageid>");
      localStringBuilder1.append("</emoticonshared>");
      localStringBuilder1.append("<template_id>" + paramb.dRK + "</template_id>");
      localStringBuilder1.append("</appmsg>");
      if (2 == paramb.cCB)
        localStringBuilder1.append("<ShakePageResult>").append(paramb.dRc).append("</ShakePageResult>");
      return localStringBuilder1.toString();
      str = ch.xv(paramb.diE);
      break;
      localStringBuilder1.append("<productitem type=\"" + paramb.dRp + "\">");
      localStringBuilder1.append("<productinfo>" + ch.xv(paramb.dRq) + "</productinfo>");
      localStringBuilder1.append("</productitem>");
      break label468;
      localStringBuilder1.append("<mallproductitem type=\"" + paramb.dRv + "\">");
      localStringBuilder1.append("<mallproductinfo>" + ch.xv(paramb.dRw) + "</mallproductinfo>");
      localStringBuilder1.append("</mallproductitem>");
      break label468;
      localStringBuilder1.append("<tvinfo>" + ch.xv(paramb.dRt) + "</tvinfo>");
      break label468;
      localStringBuilder1.append("<recorditem>" + ch.xv(paramb.dRu) + "</recorditem>");
      break label468;
      localStringBuilder1.append("<carditem>" + paramb.dRR + "</carditem>");
      break label468;
      localStringBuilder1.append("<wcpayinfo>");
      localStringBuilder1.append("<paysubtype>" + paramb.dRL + "</paysubtype>");
      localStringBuilder1.append("<feedesc>" + paramb.dRM + "</feedesc>");
      localStringBuilder1.append("<transcationid>" + paramb.dRN + "</transcationid>");
      localStringBuilder1.append("<transferid>" + paramb.dRO + "</transferid>");
      localStringBuilder1.append("<invalidtime>" + paramb.dRP + "</invalidtime>");
      localStringBuilder1.append("</wcpayinfo>");
      break label468;
      localStringBuilder1.append("<attachid>" + ch.xv(paramString) + "</attachid>");
      if ((paramkeep_SceneResult.field_fileLength > 0) && (!ch.jb(paramkeep_SceneResult.field_fileId)))
      {
        localStringBuilder1.append("<cdnattachurl>" + ch.xv(paramkeep_SceneResult.field_fileId) + "</cdnattachurl>");
        localStringBuilder1.append("<totallen>" + paramkeep_SceneResult.field_fileLength + "</totallen>");
      }
      if (paramkeep_SceneResult.field_thumbimgLength > 0)
      {
        localStringBuilder1.append("<cdnthumburl>" + ch.xv(paramkeep_SceneResult.field_fileId) + "</cdnthumburl>");
        localStringBuilder1.append("<cdnthumblength>" + paramkeep_SceneResult.field_thumbimgLength + "</cdnthumblength>");
        localStringBuilder1.append("<cdnthumbheight>" + paramInt2 + "</cdnthumbheight>");
        localStringBuilder1.append("<cdnthumbwidth>" + paramInt1 + "</cdnthumbwidth>");
        localStringBuilder1.append("<cdnthumbaeskey>" + paramkeep_SceneResult.field_aesKey + "</cdnthumbaeskey>");
      }
      localStringBuilder1.append("<aeskey>" + ch.xv(paramkeep_SceneResult.field_aesKey) + "</aeskey>");
      localStringBuilder1.append("<encryver>1</encryver>");
      localStringBuilder1.append("<fileext>" + ch.xv(paramb.dQX) + "</fileext>");
    }
  }

  public static String b(b paramb)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msg>");
    localStringBuilder.append(a(paramb, null, null, 0, 0));
    localStringBuilder.append("</msg>");
    dju.b(Integer.valueOf(localStringBuilder.toString().hashCode()), paramb);
    return localStringBuilder.toString();
  }

  public static final b iS(String paramString)
  {
    return V(paramString, null);
  }

  public static String iT(String paramString)
  {
    Map localMap = x.bB(paramString, "msg");
    String str;
    if (localMap == null)
    {
      z.e("!32@/B4Tb64lLpJNEklygrV/uBb8s7Fi6nhV", "parseAppMsgDyeingTempToShow fail, values is null");
      str = null;
    }
    do
    {
      return str;
      str = (String)localMap.get(".msg.appmsg.mmreader.category.item.title");
    }
    while (str != null);
    return "";
  }

  public static String jc(String paramString)
  {
    Map localMap = cd.AW(paramString);
    String str;
    if (localMap == null)
    {
      c localc = jj(paramString);
      StringBuilder localStringBuilder = new StringBuilder("");
      Iterator localIterator = localc.dRV.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (!ch.jb(locald.title))
          localStringBuilder.append(locald.title);
      }
      str = localStringBuilder.toString();
    }
    do
    {
      return str;
      str = (String)localMap.get(".msg.appmsg.mmreader.category.item.title");
    }
    while (str != null);
    return "";
  }

  public static c jd(String paramString)
  {
    Map localMap = cd.AW(paramString);
    if (localMap == null)
      return jj(paramString);
    int i = ch.getInt((String)localMap.get(".msg.appmsg.mmreader.category.$type"), 0);
    String str1 = ch.ja((String)localMap.get(".msg.appmsg.mmreader.name"));
    int j = ch.getInt((String)localMap.get(".msg.appmsg.mmreader.category.$count"), 0);
    String str2 = (String)localMap.get(".msg.commenturl");
    c localc = new c();
    localc.type = i;
    localc.name = str1;
    localc.ddY = str2;
    int k = 0;
    if (k < j)
    {
      d locald = new d();
      StringBuilder localStringBuilder = new StringBuilder(".msg.appmsg.mmreader.category.item");
      if (k == 0);
      for (String str3 = ""; ; str3 = String.valueOf(k))
      {
        String str4 = str3;
        locald.title = ((String)localMap.get(str4 + ".title"));
        locald.url = ((String)localMap.get(str4 + ".url"));
        locald.dRW = ((String)localMap.get(str4 + ".shorturl"));
        locald.dRX = ((String)localMap.get(str4 + ".longurl"));
        locald.time = ch.getLong((String)localMap.get(str4 + ".pub_time"), 0L);
        locald.djy = ((String)localMap.get(str4 + ".cover"));
        locald.dRY = ((String)localMap.get(str4 + ".tweetid"));
        locald.djA = ((String)localMap.get(str4 + ".digest"));
        locald.type = ch.getInt((String)localMap.get(str4 + ".itemshowtype"), 0);
        localc.dRV.add(locald);
        k++;
        break;
      }
    }
    localc.dRn = h.d(localMap);
    String str5 = ch.ja((String)localMap.get(".msg.fromusername"));
    if (!ch.jb(str5))
    {
      String str6 = bg.qW().oT().ys(str5).oc();
      localc.cNM = str5;
      localc.cNN = str6;
    }
    return localc;
  }

  private static c jj(String paramString)
  {
    try
    {
      c localc2 = new c().m(Base64.decode(paramString, 0));
      return localc2;
    }
    catch (Exception localException1)
    {
      try
      {
        c localc1 = new c().m(ch.jg(paramString));
        return localc1;
      }
      catch (Exception localException2)
      {
      }
    }
    return new c();
  }

  private static String jk(String paramString)
  {
    return "<![CDATA[" + paramString + "]]>";
  }

  public final void a(a parama)
  {
    parama.field_appId = this.appId;
    parama.field_title = this.title;
    parama.field_description = this.description;
    parama.field_type = this.type;
    parama.field_source = this.appName;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.b
 * JD-Core Version:    0.6.2
 */