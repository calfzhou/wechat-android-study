package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
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
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class mv
{
  private Context context;
  private List jnU;
  private i jnf = null;
  private String jvh = null;
  private SimpleDateFormat jvi = new SimpleDateFormat("yyyy-MM-dd");
  private String jvj = null;
  private ArrayList jvk = new ArrayList();

  public mv(Context paramContext, List paramList, i parami)
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
        z.i("!56@/B4Tb64lLpLYIS1dgc0jPU7dZGVL6m+jwvIB7XGuyN/lvsn89+XFvQ==", "isSend");
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

  private String dk(long paramLong)
  {
    return this.jvi.format(new Date(paramLong));
  }

  public final ArrayList aWr()
  {
    Object[] arrayOfObject = new Object[2];
    if (this.jvj == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      arrayOfObject[1] = Integer.valueOf(this.jnU.size());
      z.d("!56@/B4Tb64lLpLYIS1dgc0jPU7dZGVL6m+jwvIB7XGuyN/lvsn89+XFvQ==", "get image attach: history is null? %B, selectItems.size = %d", arrayOfObject);
      if (this.jvj == null)
        break;
      return this.jvk;
    }
    z.w("!56@/B4Tb64lLpLYIS1dgc0jPU7dZGVL6m+jwvIB7XGuyN/lvsn89+XFvQ==", "had not exported, do export first");
    aWs();
    return this.jvk;
  }

  public final String aWs()
  {
    Object[] arrayOfObject1 = new Object[2];
    if (this.jvj == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject1[0] = Boolean.valueOf(bool);
      arrayOfObject1[1] = Integer.valueOf(this.jnU.size());
      z.d("!56@/B4Tb64lLpLYIS1dgc0jPU7dZGVL6m+jwvIB7XGuyN/lvsn89+XFvQ==", "export: history is null? %B, selectItems.size = %d", arrayOfObject1);
      if (this.jvj == null)
        break;
      return this.jvj;
    }
    this.jvk.clear();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(aWt());
    localStringBuilder.append("\n\n");
    Iterator localIterator = this.jnU.iterator();
    ar localar;
    label180: String str9;
    if (localIterator.hasNext())
    {
      localar = (ar)localIterator.next();
      if (this.jvh == null)
      {
        this.jvh = dk(localar.kn());
        Object[] arrayOfObject14 = new Object[1];
        arrayOfObject14[0] = this.jvh;
        localStringBuilder.append(String.format("—————  %s  —————\n\n", arrayOfObject14));
        localStringBuilder.append("\n");
        if (!localar.aJD())
          break label440;
        if (!localar.aJD())
          break label434;
        if (localar.jK() != 1)
          break label317;
        Object[] arrayOfObject13 = new Object[2];
        arrayOfObject13[0] = aa(localar);
        arrayOfObject13[1] = localar.getContent();
        str9 = String.format("%s\n\n%s\n\n", arrayOfObject13);
      }
    }
    label434: label440: 
    while (true)
    {
      localStringBuilder.append(str9);
      break;
      String str1 = dk(localar.kn());
      if (str1.equals(this.jvh))
        break label180;
      this.jvh = str1;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.jvh;
      localStringBuilder.append(String.format("—————  %s  —————\n\n", arrayOfObject2));
      localStringBuilder.append("\n");
      break label180;
      label317: if (!this.jnf.getUsername().endsWith("@chatroom"))
      {
        Object[] arrayOfObject12 = new Object[2];
        arrayOfObject12[0] = aa(localar);
        arrayOfObject12[1] = localar.getContent();
        str9 = String.format("%s\n\n%s\n\n", arrayOfObject12);
      }
      else
      {
        int i = bw.ek(localar.getContent());
        if (i != -1)
        {
          Object[] arrayOfObject11 = new Object[2];
          arrayOfObject11[0] = aa(localar);
          arrayOfObject11[1] = localar.getContent().substring(i + 1).trim();
          str9 = String.format("%s\n\n%s\n\n", arrayOfObject11);
          continue;
          str9 = null;
          continue;
          if (localar.aJA())
          {
            Object[] arrayOfObject10;
            if (localar.aJA())
            {
              long l1 = localar.kk();
              long l2 = localar.kl();
              String str6 = mp.di(l1);
              if (ch.jb(str6))
                str6 = mp.dj(l2);
              z.d("!56@/B4Tb64lLpLYIS1dgc0jPU7dZGVL6m+jwvIB7XGuyN/lvsn89+XFvQ==", "hdPath[%s]", new Object[] { str6 });
              if (!ch.jb(str6))
              {
                String str7 = "file://" + str6;
                this.jvk.add(Uri.parse(str7));
                Object[] arrayOfObject9 = new Object[3];
                arrayOfObject9[0] = this.context.getString(n.bEC);
                arrayOfObject9[1] = new File(str6).getName();
                arrayOfObject9[2] = this.context.getString(n.bEy);
                String str8 = String.format("[%s(%s):%s]", arrayOfObject9);
                arrayOfObject10 = new Object[2];
                arrayOfObject10[0] = aa(localar);
                arrayOfObject10[1] = str8;
              }
            }
            for (String str5 = String.format("%s\n\n%s\n\n", arrayOfObject10); ; str5 = null)
            {
              localStringBuilder.append(str5);
              break;
            }
          }
          String str2;
          if (localar.aJw())
          {
            Object[] arrayOfObject8 = new Object[1];
            arrayOfObject8[0] = this.context.getString(n.bEH);
            str2 = String.format("[%s]", arrayOfObject8);
          }
          while (true)
          {
            z.i("!56@/B4Tb64lLpLYIS1dgc0jPU7dZGVL6m+jwvIB7XGuyN/lvsn89+XFvQ==", "formatOtherMsg, msgStr = %s", new Object[] { str2 });
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = aa(localar);
            arrayOfObject3[1] = str2;
            localStringBuilder.append(String.format("%s\n\n%s\n\n", arrayOfObject3));
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
              k localk = l.F(com.tencent.mm.ai.b.iS(ch.xw(localar.getContent())).appId, true);
              if (localk == null)
              {
                str2 = "";
              }
              else
              {
                String str4 = localk.field_appName;
                Object[] arrayOfObject7 = new Object[2];
                arrayOfObject7[0] = this.context.getString(n.bEx);
                arrayOfObject7[1] = str4;
                str2 = String.format("[%s: %s]", arrayOfObject7);
              }
            }
            else if (localar.aJB())
            {
              String str3 = bg.qW().oV().zD(localar.getContent()).iV();
              Object[] arrayOfObject6 = new Object[2];
              arrayOfObject6[0] = this.context.getString(n.bEz);
              arrayOfObject6[1] = str3;
              str2 = String.format("[%s: %s]", arrayOfObject6);
            }
            else if (localar.aJE())
            {
              Object[] arrayOfObject5 = new Object[1];
              arrayOfObject5[0] = this.context.getString(n.bEG);
              str2 = String.format("[%s]", arrayOfObject5);
            }
            else if ((localar.aJF()) || (localar.aJG()))
            {
              Object[] arrayOfObject4 = new Object[1];
              arrayOfObject4[0] = this.context.getString(n.bEA);
              str2 = String.format("[%s]", arrayOfObject4);
              continue;
              localStringBuilder.append("\n\n");
              this.jvj = localStringBuilder.toString();
              return this.jvj;
            }
            else
            {
              str2 = null;
            }
          }
        }
        else
        {
          str9 = null;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mv
 * JD-Core Version:    0.6.2
 */