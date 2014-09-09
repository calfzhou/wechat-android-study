package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.c.a.fg;
import com.tencent.mm.c.a.fi;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.tools.bk;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class QQMailHistoryExporter
{
  private static final char[] gWy = { 60, 62, 34, 39, 38, 10 };
  private static final String[] gWz = { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "<br />" };
  private static final String jvl = "<img id=\"%d:%d\" src=\"%s\" height=\"100\" onclick=\"" + bk.bn("img_onclick", "this.id + '@@' + this.src") + "\"></img>";
  private Context context;
  private List jnU;
  private i jnf = null;
  private String jvh = null;

  public QQMailHistoryExporter(Context paramContext, List paramList, i parami)
  {
    this.context = paramContext;
    this.jnU = paramList;
    this.jnf = parami;
  }

  private String aWt()
  {
    if (!this.jnf.getUsername().endsWith("@chatroom"))
    {
      String str4 = this.context.getString(n.cef);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.jnf.oc();
      arrayOfObject[1] = bg.qW().oQ().get(4);
      return String.format(str4, arrayOfObject);
    }
    String str2;
    if (ch.jb(this.jnf.iV()))
    {
      Iterator localIterator = v.cU(this.jnf.getUsername()).iterator();
      String str3;
      for (str2 = ""; localIterator.hasNext(); str2 = str2 + str3 + ", ")
        str3 = y.dh((String)localIterator.next());
    }
    for (String str1 = str2.substring(0, -2 + str2.length()); ; str1 = this.jnf.oc())
      return String.format(this.context.getString(n.cee), new Object[] { str1 });
  }

  private String aa(ar paramar)
  {
    String str2;
    if (!this.jnf.getUsername().endsWith("@chatroom"))
      str2 = y.dh(paramar.kt());
    while (true)
    {
      if (paramar.jK() == 1)
      {
        z.i("!44@/B4Tb64lLpIGnfVXnKYnmBgOb8pGVvusGTuwjXWeNHk=", "isSend");
        str2 = x.pI();
      }
      long l = paramar.kn();
      String str3 = new SimpleDateFormat("HH:mm").format(new Date(l));
      StringBuilder localStringBuilder = new StringBuilder("");
      localStringBuilder.append(str2);
      localStringBuilder.append("  ");
      localStringBuilder.append(str3);
      return localStringBuilder.toString();
      String str1 = paramar.getContent();
      int i = bw.ek(str1);
      str2 = null;
      if (i != -1)
        str2 = y.dh(str1.substring(0, i).trim());
    }
  }

  private static String dk(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd").format(new Date(paramLong));
  }

  private static String xv(String paramString)
  {
    if (paramString == null)
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      char c = paramString.charAt(j);
      int k = 1;
      for (int m = -1 + gWy.length; ; m--)
        if (m >= 0)
        {
          if (gWy[m] == c)
          {
            localStringBuffer.append(gWz[m]);
            k = 0;
          }
        }
        else
        {
          if (k != 0)
            localStringBuffer.append(c);
          j++;
          break;
        }
    }
    return localStringBuffer.toString();
  }

  public final String aWs()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.jnU.size());
    z.i("!44@/B4Tb64lLpIGnfVXnKYnmBgOb8pGVvusGTuwjXWeNHk=", "selectItems.size = %d", arrayOfObject1);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<div id=\"history\">\n");
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = aWt();
    localStringBuilder.append(String.format("<p>Dear:</p> <br> <p style=\"text-indent:2em;\">%s</p> <br>", arrayOfObject2));
    Iterator localIterator = this.jnU.iterator();
    ar localar;
    label151: String str18;
    if (localIterator.hasNext())
    {
      localar = (ar)localIterator.next();
      if (this.jvh == null)
      {
        this.jvh = dk(localar.kn());
        Object[] arrayOfObject26 = new Object[1];
        arrayOfObject26[0] = this.jvh;
        localStringBuilder.append(String.format("<p style=\"text-align:center;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n", arrayOfObject26));
        if (!localar.aJD())
          break label419;
        if (!localar.aJD())
          break label413;
        if (localar.jK() != 1)
          break label290;
        Object[] arrayOfObject25 = new Object[2];
        arrayOfObject25[0] = aa(localar);
        arrayOfObject25[1] = xv(localar.getContent());
        str18 = String.format("<p><b>%s</b></p>\n  <p>%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", arrayOfObject25);
      }
    }
    label413: label1057: 
    while (true)
    {
      localStringBuilder.append(str18);
      break;
      String str1 = dk(localar.kn());
      if (str1.equals(this.jvh))
        break label151;
      this.jvh = str1;
      localStringBuilder.append("<br>");
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.jvh;
      localStringBuilder.append(String.format("<p style=\"text-align:center;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n", arrayOfObject3));
      break label151;
      label290: if (!this.jnf.getUsername().endsWith("@chatroom"))
      {
        Object[] arrayOfObject24 = new Object[2];
        arrayOfObject24[0] = aa(localar);
        arrayOfObject24[1] = xv(localar.getContent());
        str18 = String.format("<p><b>%s</b></p>\n  <p>%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", arrayOfObject24);
      }
      else
      {
        int k = bw.ek(localar.getContent());
        if (k != -1)
        {
          Object[] arrayOfObject23 = new Object[2];
          arrayOfObject23[0] = aa(localar);
          arrayOfObject23[1] = xv(localar.getContent().substring(k + 1).trim());
          str18 = String.format("<p><b>%s</b></p>\n  <p>%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", arrayOfObject23);
          continue;
          str18 = null;
          continue;
          label419: if (localar.aJA())
          {
            Object[] arrayOfObject22;
            if (localar.aJA())
            {
              long l1 = localar.kk();
              long l2 = localar.kl();
              String str14 = mp.di(l1);
              if (ch.jb(str14))
                str14 = mp.dj(l2);
              z.d("!44@/B4Tb64lLpIGnfVXnKYnmBgOb8pGVvusGTuwjXWeNHk=", "hdPath[%s]", new Object[] { str14 });
              if (!ch.jb(str14))
              {
                String str15 = "file://" + str14;
                String str16 = jvl;
                Object[] arrayOfObject21 = new Object[4];
                arrayOfObject21[0] = Long.valueOf(localar.kk());
                arrayOfObject21[1] = Long.valueOf(localar.kl());
                arrayOfObject21[2] = str15;
                arrayOfObject21[3] = str14;
                String str17 = String.format(str16, arrayOfObject21);
                arrayOfObject22 = new Object[2];
                arrayOfObject22[0] = aa(localar);
                arrayOfObject22[1] = str17;
              }
            }
            for (String str13 = String.format("<p><b>%s</b></p>\n  <p>%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", arrayOfObject22); ; str13 = null)
            {
              localStringBuilder.append(str13);
              break;
            }
          }
          String str2;
          if (localar.aJw())
          {
            Object[] arrayOfObject20 = new Object[1];
            arrayOfObject20[0] = this.context.getString(n.bEH);
            str2 = String.format("[%s]", arrayOfObject20);
          }
          while (true)
          {
            z.d("!44@/B4Tb64lLpIGnfVXnKYnmBgOb8pGVvusGTuwjXWeNHk=", "formatOtherMsg, msgStr = %s", new Object[] { str2 });
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = aa(localar);
            arrayOfObject4[1] = str2;
            localStringBuilder.append(String.format("<p><b>%s</b></p>\n  <p>%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", arrayOfObject4));
            break;
            if (localar.aJy())
            {
              if (localar.jK() == 1)
                str2 = this.context.getString(n.bEF);
              else
                str2 = this.context.getString(n.bEE);
            }
            else if (localar.aJC())
            {
              fg localfg = new fg();
              localfg.cKA.cKC = 1;
              localfg.cKA.cCp = localar;
              a.aGB().g(localfg);
              str2 = String.format("[%s]", new Object[] { localfg.cKB.cKF });
            }
            else if (localar.aJu())
            {
              String str4 = localar.getContent();
              if (this.jnf.getUsername().endsWith("@chatroom"))
              {
                z.d("!44@/B4Tb64lLpIGnfVXnKYnmBgOb8pGVvusGTuwjXWeNHk=", "chatroom msg, parse it");
                int j = bw.ek(localar.getContent());
                if (j != -1)
                  str4 = xv(localar.getContent().substring(j + 1).trim());
              }
              com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(ch.xw(str4));
              if (localb == null)
              {
                z.w("!44@/B4Tb64lLpIGnfVXnKYnmBgOb8pGVvusGTuwjXWeNHk=", "appmsg content is null");
                Object[] arrayOfObject19 = new Object[1];
                arrayOfObject19[0] = this.context.getString(n.bEx);
                str2 = String.format("[%s]", arrayOfObject19);
              }
              else
              {
                k localk = l.F(localb.appId, true);
                String str5;
                label997: String str6;
                int i;
                if ((localk == null) || (ch.jb(localk.field_appName)))
                {
                  str5 = localb.appName;
                  str6 = l.a(this.context, localk, str5);
                  if (localar.getType() != 16777265)
                    break label1057;
                  i = 1;
                }
                while (true)
                  if (i != 0)
                  {
                    if (ch.jb(str6))
                    {
                      str2 = localb.title;
                      break;
                      str5 = localk.field_appName;
                      break label997;
                      i = 0;
                      continue;
                    }
                    Object[] arrayOfObject18 = new Object[2];
                    arrayOfObject18[0] = str6;
                    arrayOfObject18[1] = localb.title;
                    str2 = String.format("[%s: %s]", arrayOfObject18);
                    break;
                  }
                if (localar.aJH())
                {
                  String str10 = mp.a(localar, localb);
                  if (!ch.jb(str10))
                  {
                    String str11 = "file://" + str10;
                    String str12 = jvl;
                    Object[] arrayOfObject17 = new Object[4];
                    arrayOfObject17[0] = Long.valueOf(localar.kk());
                    arrayOfObject17[1] = Long.valueOf(localar.kl());
                    arrayOfObject17[2] = str11;
                    arrayOfObject17[3] = str10;
                    str2 = String.format(str12, arrayOfObject17);
                  }
                }
                else
                {
                  switch (localb.type)
                  {
                  case 7:
                  default:
                    Object[] arrayOfObject16 = new Object[1];
                    arrayOfObject16[0] = this.context.getString(n.bEx);
                    str2 = String.format("[%s]", arrayOfObject16);
                    break;
                  case 3:
                    if (ch.jb(localb.description))
                    {
                      Object[] arrayOfObject15 = new Object[2];
                      arrayOfObject15[0] = this.context.getString(n.bED);
                      arrayOfObject15[1] = localb.title;
                      str2 = String.format("[%s: %s]", arrayOfObject15);
                      continue;
                    }
                    Object[] arrayOfObject14 = new Object[3];
                    arrayOfObject14[0] = this.context.getString(n.bED);
                    arrayOfObject14[1] = localb.title;
                    arrayOfObject14[2] = localb.description;
                    str2 = String.format("[%s: %s-%s]", arrayOfObject14);
                    break;
                  case 8:
                    Object[] arrayOfObject13 = new Object[1];
                    arrayOfObject13[0] = this.context.getString(n.bEA);
                    str2 = String.format("[%s]", arrayOfObject13);
                    break;
                  case 6:
                    if (ch.jb(localb.description))
                    {
                      Object[] arrayOfObject12 = new Object[2];
                      arrayOfObject12[0] = this.context.getString(n.bEB);
                      arrayOfObject12[1] = localb.title;
                      str2 = String.format("[%s: %s]", arrayOfObject12);
                      continue;
                    }
                    Object[] arrayOfObject11 = new Object[3];
                    arrayOfObject11[0] = this.context.getString(n.bEB);
                    arrayOfObject11[1] = localb.title;
                    arrayOfObject11[2] = localb.description;
                    str2 = String.format("[%s: %s-%s]", arrayOfObject11);
                    break;
                  case 2:
                    String str7 = mp.a(localar, localb);
                    if (ch.jb(str7))
                      break label1886;
                    String str8 = "file://" + str7;
                    String str9 = jvl;
                    Object[] arrayOfObject10 = new Object[4];
                    arrayOfObject10[0] = Long.valueOf(localar.kk());
                    arrayOfObject10[1] = Long.valueOf(localar.kl());
                    arrayOfObject10[2] = str8;
                    arrayOfObject10[3] = str7;
                    str2 = String.format(str9, arrayOfObject10);
                    break;
                  case 1:
                    if (ch.jb(str6))
                    {
                      str2 = localb.title;
                      continue;
                    }
                    Object[] arrayOfObject9 = new Object[2];
                    arrayOfObject9[0] = str6;
                    arrayOfObject9[1] = localb.title;
                    str2 = String.format("[%s: %s]", arrayOfObject9);
                    break;
                  case 4:
                  case 5:
                    Object[] arrayOfObject8 = new Object[2];
                    arrayOfObject8[0] = localb.title;
                    arrayOfObject8[1] = localb.url;
                    str2 = String.format("[%s: %s]", arrayOfObject8);
                    break;
                  }
                }
              }
            }
            else if (localar.aJB())
            {
              String str3 = bg.qW().oV().zD(localar.getContent()).iV();
              Object[] arrayOfObject7 = new Object[2];
              arrayOfObject7[0] = this.context.getString(n.bEz);
              arrayOfObject7[1] = str3;
              str2 = String.format("[%s: %s]", arrayOfObject7);
            }
            else if (localar.aJE())
            {
              Object[] arrayOfObject6 = new Object[1];
              arrayOfObject6[0] = this.context.getString(n.bEG);
              str2 = String.format("[%s]", arrayOfObject6);
            }
            else if ((localar.aJF()) || (localar.aJG()))
            {
              Object[] arrayOfObject5 = new Object[1];
              arrayOfObject5[0] = this.context.getString(n.bEA);
              str2 = String.format("[%s]", arrayOfObject5);
              continue;
              localStringBuilder.append("\n</div>\n");
              return localStringBuilder.toString();
            }
            else
            {
              str2 = null;
              continue;
              label1886: str2 = "";
            }
          }
        }
        else
        {
          str18 = null;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.QQMailHistoryExporter
 * JD-Core Version:    0.6.2
 */