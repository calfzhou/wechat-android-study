package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.mm.c.a.cc;
import com.tencent.mm.c.a.co;
import com.tencent.mm.c.a.cq;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.n;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.cr;
import com.tencent.mm.storage.cs;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;

public class ExtControlProviderMsg extends ExtContentProviderBase
{
  private static final UriMatcher eMf;
  private static final String[] eMg = { "msgId", "fromUserId", "fromUserNickName", "msgType", "contentType", "content", "status", "createTime" };
  private static final String[] eMh = { "userId", "unReadCount" };
  private static final String[] eMi = { "userId", "unReadCount" };
  private static final String[] eMj = { "userId", "retCode", "msgId" };
  private static final String[] eMk = { "msgId", "retCode" };
  private static final String[] eMl = { "msgId", "retCode" };
  private MatrixCursor eMm = null;

  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    eMf = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.message", "oneMsg", 7);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "unReadCount", 8);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "unReadMsgs", 9);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "unReadUserList", 10);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "recordMsg", 11);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "playVoice", 12);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "setReaded", 13);
    eMf.addURI("com.tencent.mm.plugin.ext.message", "sendTextMsg", 14);
  }

  private Cursor Qi()
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "getUnReadUserList()");
    MatrixCursor localMatrixCursor = new MatrixCursor(eMi);
    while (true)
    {
      try
      {
        Cursor localCursor = bg.qW().oV().aKq();
        if (localCursor != null)
        {
          if (localCursor.moveToFirst())
          {
            String str = localCursor.getString(localCursor.getColumnIndex("talker"));
            i locali = bg.qW().oT().ys(str);
            if (!y.dc(str))
            {
              if ((y.dP(locali.getUsername())) || (y.dO(locali.getUsername())) || (i.nY(locali.jd())) || (y.dG(locali.getUsername())))
                break label241;
              if (!y.dH(locali.getUsername()))
                continue;
              break label241;
              if (i == 0)
              {
                long l = (int)locali.dhv;
                Object[] arrayOfObject = new Object[2];
                arrayOfObject[0] = com.tencent.mm.plugin.ext.a.a.aS(l);
                arrayOfObject[1] = Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("unReadCount")));
                localMatrixCursor.addRow(arrayOfObject);
              }
            }
            if (localCursor.moveToNext())
              continue;
          }
          else
          {
            localCursor.close();
          }
        }
        else
        {
          hg(0);
          return localMatrixCursor;
        }
        i = 1;
        continue;
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
        localMatrixCursor.close();
        hg(4);
        return null;
      }
      label241: int i = 0;
    }
  }

  private Cursor a(String[] paramArrayOfString, String paramString1, String paramString2)
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "getUnReadMsgs(), %s, %s", new Object[] { paramString1, paramString2 });
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
      return null;
    }
    if ((paramString1 != null) && (paramString1.equalsIgnoreCase("openapi")));
    for (boolean bool1 = true; ; bool1 = false)
    {
      if (bool1);
      while (true)
      {
        i locali;
        Object localObject;
        int i;
        try
        {
          cr localcr = com.tencent.mm.plugin.ext.b.Qb().Ad(paramArrayOfString[0]);
          if ((localcr == null) || (ch.jb(localcr.field_openId)) || (ch.jb(localcr.field_username)))
          {
            z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "openidInApp is null");
            hg(3);
            return null;
          }
          locali = bg.qW().oT().ys(localcr.field_username);
          if ((locali == null) || (locali.getUsername() == null) || (locali.getUsername().length() <= 0))
          {
            z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "contact is null");
            hg(3);
            return null;
            long l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[0]);
            locali = bg.qW().oT().cT(l);
            continue;
          }
          localObject = locali.od();
          if (!locali.getUsername().endsWith("@chatroom"))
            break label492;
          String str = y.dh(locali.getUsername());
          localObject = str;
          bool2 = true;
          if (!bool1)
            break label375;
          try
          {
            int j = Integer.parseInt(paramString2);
            i = j;
            if ((i <= 0) || (i >= 15))
            {
              localCursor = bg.qW().oV().al(locali.getUsername(), 15);
              if (localCursor != null)
                break label395;
              z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "msgCursor == null");
              hg(4);
              return null;
            }
          }
          catch (Exception localException3)
          {
            z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "exception in parseInt(%s)", new Object[] { paramString2 });
            i = 0;
            continue;
          }
        }
        catch (Exception localException1)
        {
          localMatrixCursor = null;
          z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException1.getMessage());
          if (localMatrixCursor != null)
            localMatrixCursor.close();
          hg(4);
          return null;
        }
        Cursor localCursor = bg.qW().oV().al(locali.getUsername(), i);
        continue;
        label375: localCursor = bg.qW().oV().al(locali.getUsername(), 3);
        continue;
        label395: MatrixCursor localMatrixCursor = new MatrixCursor(eMg);
        try
        {
          if ((localCursor.getCount() > 0) && (localCursor.moveToFirst()))
          {
            ar localar = new ar();
            do
            {
              localar.b(localCursor);
              a(localMatrixCursor, localar, locali, bool2, (String)localObject, bool1, paramArrayOfString[0]);
            }
            while (localCursor.moveToNext());
          }
          localCursor.close();
          hg(0);
          return localMatrixCursor;
        }
        catch (Exception localException2)
        {
        }
        continue;
        label492: boolean bool2 = false;
      }
    }
  }

  private void a(MatrixCursor paramMatrixCursor, ar paramar, i parami, boolean paramBoolean1, String paramString1, boolean paramBoolean2, String paramString2)
  {
    if (paramar == null);
    do
    {
      return;
      if (ch.jb(paramString2))
      {
        z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "userOpenId is null");
        return;
      }
    }
    while ((paramar.getType() == 9999) || (paramar.getType() == 10000));
    Object localObject = "";
    String str1 = "";
    if (paramBoolean1)
    {
      int m = bw.ek(paramar.getContent());
      if ((m != -1) && (paramar.getContent().length() > m))
      {
        String str3 = paramar.getContent().substring(0, m).trim();
        if ((str3 != null) && (str3.length() > 0) && (paramar.getContent().length() >= m + 2))
        {
          localObject = y.dh(str3);
          str1 = paramar.getContent().substring(m + 2);
        }
      }
    }
    int i = com.tencent.mm.plugin.ext.b.a.q(paramar);
    label196: String str2;
    if (i == 1)
    {
      if (paramBoolean1);
      for (localObject = (String)localObject + "!]" + str1; paramBoolean2; localObject = paramar.getContent())
        try
        {
          if (!ch.jb(paramString2))
            break label350;
          z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "userId is null");
          return;
        }
        catch (Exception localException)
        {
          z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
          return;
        }
    }
    else if (i == 2)
    {
      br localbr = bm.BD().eR((int)paramar.kk());
      if ((localbr == null) || (localbr.getFileName() == null))
        break label466;
      str2 = bs.gP(localbr.getFileName());
      z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "voice file = %s", new Object[] { str2 });
    }
    while (true)
    {
      localObject = str2;
      break;
      if (paramBoolean1)
        break;
      if (getContext() != null)
      {
        localObject = getContext().getString(n.bGB);
        break;
      }
      localObject = "";
      break;
      paramString2 = com.tencent.mm.plugin.ext.a.a.aS((int)parami.dhv);
      break label196;
      label350: Object[] arrayOfObject = new Object[8];
      arrayOfObject[0] = com.tencent.mm.plugin.ext.a.a.aS(paramar.kk());
      arrayOfObject[1] = paramString2;
      arrayOfObject[2] = paramString1;
      int j;
      if (paramar.jK() == 0)
      {
        j = 1;
        arrayOfObject[3] = Integer.valueOf(j);
        arrayOfObject[4] = Integer.valueOf(i);
        arrayOfObject[5] = localObject;
        if (paramar.getStatus() != 4)
          break label460;
      }
      label460: for (int k = 1; ; k = 2)
      {
        arrayOfObject[6] = Integer.valueOf(k);
        arrayOfObject[7] = Long.valueOf(paramar.kn());
        paramMatrixCursor.addRow(arrayOfObject);
        return;
        j = 2;
        break;
      }
      label466: str2 = "";
    }
  }

  private Cursor b(String[] paramArrayOfString, String paramString)
  {
    boolean bool1 = true;
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "getOneMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
      return null;
    }
    try
    {
      long l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[0]);
      ar localar = bg.qW().oV().cV(l);
      i locali = bg.qW().oT().ys(localar.kt());
      if ((locali == null) || ((int)locali.dhv <= 0))
      {
        hg(3);
        return null;
      }
      String str = locali.od();
      if (locali.getUsername().endsWith("@chatroom"))
      {
        str = y.dh(locali.getUsername());
        bool2 = bool1;
        if ((paramString != null) && (paramString.equalsIgnoreCase("openapi")));
        while (true)
        {
          localMatrixCursor = new MatrixCursor(eMg);
          try
          {
            a(localMatrixCursor, localar, locali, bool2, str, bool1, paramArrayOfString[0]);
            hg(0);
            return localMatrixCursor;
          }
          catch (Exception localException1)
          {
          }
          z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException1.getMessage());
          if (localMatrixCursor != null)
            localMatrixCursor.close();
          hg(4);
          return null;
          bool1 = false;
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        MatrixCursor localMatrixCursor = null;
        continue;
        boolean bool2 = false;
      }
    }
  }

  private Cursor j(String[] paramArrayOfString)
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "getUnReadCount()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
      return null;
    }
    MatrixCursor localMatrixCursor = new MatrixCursor(eMh);
    while (true)
    {
      int i;
      try
      {
        boolean bool = "*".equals(paramArrayOfString[0]);
        i = 0;
        if (bool)
        {
          int j = bg.qW().oW().dY("");
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = "0";
          arrayOfObject1[1] = Integer.valueOf(j);
          localMatrixCursor.addRow(arrayOfObject1);
          hg(0);
          return localMatrixCursor;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
        localMatrixCursor.close();
        hg(4);
        return null;
      }
      while (i < paramArrayOfString.length)
      {
        long l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[i]);
        i locali = bg.qW().oT().cT(l);
        if ((locali != null) && ((int)locali.dhv > 0))
        {
          int k = bg.qW().oW().dY(" and ( rconversation.username='" + locali.getUsername() + "' );");
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Long.valueOf(l);
          arrayOfObject2[1] = Integer.valueOf(k);
          localMatrixCursor.addRow(arrayOfObject2);
        }
        i++;
      }
    }
  }

  private Cursor k(String[] paramArrayOfString)
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "handleRecordMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
      return null;
    }
    try
    {
      int i = Integer.valueOf(paramArrayOfString[0]).intValue();
      long l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[1]);
      if (l <= 0L)
      {
        hg(3);
        return null;
      }
      com.tencent.mm.pluginsdk.d.a.a locala = new com.tencent.mm.pluginsdk.d.a.a();
      locala.a(4000L, new c(this, i, l, locala, paramArrayOfString));
      MatrixCursor localMatrixCursor = this.eMm;
      return localMatrixCursor;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
      if (this.eMm != null)
        this.eMm.close();
      hg(4);
    }
    return null;
  }

  private Cursor l(String[] paramArrayOfString)
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "handlePlayVoice()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length < 2))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
    }
    int i;
    do
    {
      return null;
      while (true)
      {
        long l;
        Object localObject2;
        try
        {
          i = Integer.valueOf(paramArrayOfString[0]).intValue();
          l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[1]);
          if (l <= 0L)
          {
            hg(3);
            return null;
          }
        }
        catch (Exception localException1)
        {
          localObject2 = null;
          z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException1.getMessage());
          if (localObject2 != null)
            localObject2.close();
          hg(4);
          return null;
        }
        if (i != 3)
          break;
        MatrixCursor localMatrixCursor = new MatrixCursor(eMk);
        try
        {
          co localco = new co();
          localco.cJb.cDM = l;
          com.tencent.mm.sdk.c.a.aGB().g(localco);
          if ((localco.cJc.rI == null) || (localco.cJc.rI.length() <= 0))
          {
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = paramArrayOfString[1];
            arrayOfObject1[1] = Integer.valueOf(2);
            localMatrixCursor.addRow(arrayOfObject1);
            hg(4);
            return localMatrixCursor;
          }
          cc localcc2 = new cc();
          localcc2.cIQ.op = 1;
          localcc2.cIQ.rI = localco.cJc.rI;
          if (com.tencent.mm.sdk.c.a.aGB().g(localcc2))
          {
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = paramArrayOfString[1];
            arrayOfObject3[1] = Integer.valueOf(1);
            localMatrixCursor.addRow(arrayOfObject3);
            hg(0);
          }
          while (true)
          {
            com.tencent.mm.plugin.ext.b.PZ();
            com.tencent.mm.plugin.ext.b.aR(l);
            return localMatrixCursor;
            z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "play failed");
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = paramArrayOfString[1];
            arrayOfObject2[1] = Integer.valueOf(2);
            localMatrixCursor.addRow(arrayOfObject2);
            hg(4);
          }
        }
        catch (Exception localException2)
        {
          localObject2 = localMatrixCursor;
          Object localObject1 = localException2;
        }
      }
    }
    while (i != 4);
    cc localcc1 = new cc();
    localcc1.cIQ.op = 2;
    if (com.tencent.mm.sdk.c.a.aGB().g(localcc1))
    {
      z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "stop last playing");
      hg(0);
      return null;
    }
    z.i("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "stop last playing fail");
    hg(4);
    return null;
  }

  private Cursor m(String[] paramArrayOfString)
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "setMsgReaded()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
      return null;
    }
    int i = 0;
    try
    {
      while (i < paramArrayOfString.length)
      {
        if ((paramArrayOfString[i] != null) && (paramArrayOfString[i].length() > 0))
        {
          long l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[i]);
          com.tencent.mm.plugin.ext.b.PZ();
          com.tencent.mm.plugin.ext.b.aR(l);
        }
        i++;
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
      hg(4);
      return null;
    }
    hg(0);
    return null;
  }

  private Cursor n(String[] paramArrayOfString)
  {
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "sendTextMsg()");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "wrong args");
      hg(3);
      return null;
    }
    long l;
    try
    {
      l = com.tencent.mm.plugin.ext.a.a.lX(paramArrayOfString[0]);
      if (l <= 0L)
      {
        hg(3);
        return null;
      }
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
      if (this.eMm != null)
        this.eMm.close();
      hg(4);
      return null;
    }
    com.tencent.mm.plugin.ext.b.PZ();
    i locali = com.tencent.mm.plugin.ext.b.aQ(l);
    if ((locali == null) || ((int)locali.dhv <= 0))
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "toContact is null ");
      hg(3);
      return null;
    }
    this.eMm = new MatrixCursor(eMl);
    com.tencent.mm.pluginsdk.d.a.a locala = new com.tencent.mm.pluginsdk.d.a.a();
    locala.a(15000L, new d(this, locali, paramArrayOfString, locala));
    return this.eMm;
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    a(paramUri, getContext(), eMf);
    if (paramUri == null)
    {
      hg(3);
      return null;
    }
    if ((ch.jb(Qg())) || (ch.jb(Qh())))
    {
      hg(3);
      return null;
    }
    if (!HL())
    {
      hg(1);
      return this.ehO;
    }
    if (!as(getContext()))
    {
      z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "invalid appid ! return null");
      hg(2);
      return null;
    }
    String str1 = ch.ja(paramUri.getQueryParameter("source"));
    String str2 = ch.ja(paramUri.getQueryParameter("count"));
    switch (eMf.match(paramUri))
    {
    default:
      hg(3);
      return null;
    case 7:
      return b(paramArrayOfString2, str1);
    case 8:
      return j(paramArrayOfString2);
    case 9:
      return a(paramArrayOfString2, str1, str2);
    case 10:
      return Qi();
    case 11:
      return k(paramArrayOfString2);
    case 12:
      return l(paramArrayOfString2);
    case 13:
      return m(paramArrayOfString2);
    case 14:
    }
    return n(paramArrayOfString2);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg
 * JD-Core Version:    0.6.2
 */