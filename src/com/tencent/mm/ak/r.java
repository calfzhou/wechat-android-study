package com.tencent.mm.ak;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.mm.a.c;
import com.tencent.mm.a.f;
import com.tencent.mm.as.h;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import junit.framework.Assert;

public final class r
{
  private static long dGl = 0L;
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS videoinfo2 ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ) ", "CREATE TABLE IF NOT EXISTS videoinfo ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ) ", "alter table videoinfo2 add videofuncflag int ;", "alter table videoinfo add videofuncflag int ;", "insert into videoinfo2 select * from videoinfo ;", "delete from videoinfo ;" };
  private String dGk = null;
  private h dmb;
  private am dnh = new s(this);

  public r(h paramh, String paramString)
  {
    this.dmb = paramh;
    this.dGk = paramString;
  }

  public static int a(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + " invalid fileName");
      return 0 - k.nJ();
    }
    if (paramInt < 0)
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + "[" + paramString + "]  invalid startOffset:" + paramInt);
      return 0 - k.nJ();
    }
    if (ch.B(paramArrayOfByte))
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + "[" + paramString + "]  invalid writeBuf");
      return 0 - k.nJ();
    }
    l locall = new l();
    try
    {
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramString, "rw");
      long l1 = locall.nM();
      localRandomAccessFile.seek(paramInt);
      long l2 = locall.nM();
      localRandomAccessFile.write(paramArrayOfByte, 0, paramArrayOfByte.length);
      long l3 = locall.nM();
      int i = (int)localRandomAccessFile.getFilePointer();
      localRandomAccessFile.close();
      long l4 = locall.nM();
      z.d("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "FIN:" + k.nL() + "[" + paramString + "]  Offset:" + paramInt + " buf:" + paramArrayOfByte.length);
      z.d("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "FIN:" + k.nL() + "[" + paramString + "] open:" + l1 + " seek:" + l2 + " write:" + l3 + " close:" + l4);
      return i;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + "[" + paramString + "] \t\tOffset:" + paramInt + " failed:[" + localException.getMessage() + "]");
    }
    return 0 - k.nJ();
  }

  public static u e(String paramString, int paramInt1, int paramInt2)
  {
    u localu = new u();
    if (ch.jb(paramString))
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + " invalid fileName");
      localu.ret = (0 - k.nJ());
      return localu;
    }
    if (paramInt1 < 0)
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + "[" + paramString + "]  invalid readOffset:" + paramInt1);
      localu.ret = (0 - k.nJ());
      return localu;
    }
    if (paramInt2 <= 0)
    {
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + "[" + paramString + "]  invalid readLen");
      localu.ret = (0 - k.nJ());
      return localu;
    }
    l locall = new l();
    localu.buf = new byte[paramInt2];
    while (true)
    {
      int i;
      try
      {
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramString, "r");
        long l1 = locall.nM();
        localRandomAccessFile.seek(paramInt1);
        long l2 = locall.nM();
        i = localRandomAccessFile.read(localu.buf, 0, paramInt2);
        long l3 = locall.nM();
        localRandomAccessFile.close();
        long l4 = locall.nM();
        j = 0;
        if (i < 0)
        {
          localu.ddA = j;
          localu.dGn = (j + paramInt1);
          z.d("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "FIN:" + k.nL() + "[" + paramString + "]  Offset:" + paramInt1 + " readlen:" + paramInt2);
          z.d("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "FIN:" + k.nL() + "[" + paramString + "] open:" + l1 + " seek:" + l2 + " write:" + l3 + " close:" + l4);
          return localu;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "ERR:" + k.nL() + "[" + paramString + "] \t\tOffset:" + localu.dGn + " failed:[" + localException.getMessage() + "]");
        localu.ret = (0 - k.nJ());
        return localu;
      }
      int j = i;
    }
  }

  public static String ia(String paramString)
  {
    long l1 = System.currentTimeMillis();
    String str1 = new SimpleDateFormat("HHmmssddMMyy").format(new Date(l1));
    if ((paramString != null) && (paramString.length() > 1))
      str1 = str1 + f.d(paramString.getBytes()).substring(0, 7);
    String str2 = str1 + l1 % 10000L;
    StringBuilder localStringBuilder = new StringBuilder().append(str2);
    long l2 = dGl;
    dGl = 1L + l2;
    return l2;
  }

  public static int id(String paramString)
  {
    int i;
    if (ch.jb(paramString))
      i = -1;
    int j;
    do
    {
      File localFile;
      boolean bool;
      do
      {
        return i;
        localFile = new File(paramString);
        bool = localFile.exists();
        i = 0;
      }
      while (!bool);
      j = (int)localFile.length();
      i = 0;
    }
    while (j <= 0);
    return j;
  }

  public final List Ba()
  {
    String str = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag from videoinfo2  " + " WHERE status<197  order by downloadtime desc";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    int i = localCursor.getCount();
    z.d("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "getUnfinishInfo resCount:" + i);
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      q localq = new q();
      localq.b(localCursor);
      localArrayList.add(localq);
    }
    localCursor.close();
    return localArrayList;
  }

  public final String Bb()
  {
    return this.dGk;
  }

  public final void a(t paramt)
  {
    this.dnh.remove(paramt);
  }

  public final void a(t paramt, Looper paramLooper)
  {
    this.dnh.a(paramt, paramLooper);
  }

  public final boolean a(q paramq)
  {
    paramq.db(-1);
    ContentValues localContentValues = paramq.ir();
    if ((int)this.dmb.insert("videoinfo2", "filename", localContentValues) != -1)
    {
      this.dnh.ae(paramq.getFileName());
      this.dnh.Bo();
      return true;
    }
    return false;
  }

  public final boolean b(q paramq)
  {
    boolean bool1;
    boolean bool2;
    label22: ContentValues localContentValues;
    if (paramq != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (paramq.getFileName().length() <= 0)
        break label55;
      bool2 = true;
      Assert.assertTrue(bool2);
      localContentValues = paramq.ir();
      if (localContentValues.size() > 0)
        break label60;
      z.e("!44@/B4Tb64lLpLawpQVdf0e97ZG1pRTwgcUuylIOhjr9bk=", "update failed, no values set");
    }
    label55: label60: h localh;
    String[] arrayOfString;
    do
    {
      return false;
      bool1 = false;
      break;
      bool2 = false;
      break label22;
      localh = this.dmb;
      arrayOfString = new String[1];
      arrayOfString[0] = paramq.getFileName();
    }
    while (localh.update("videoinfo2", localContentValues, "filename= ?", arrayOfString) <= 0);
    this.dnh.ae(paramq.getFileName());
    this.dnh.Bo();
    return true;
  }

  public final void hX(String paramString)
  {
    this.dnh.ae(paramString);
    this.dnh.Bo();
  }

  public final q hY(String paramString)
  {
    String str = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag from videoinfo2   where videoinfo2.filename = \"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    boolean bool = localCursor.moveToFirst();
    q localq = null;
    if (bool)
    {
      localq = new q();
      localq.b(localCursor);
    }
    localCursor.close();
    return localq;
  }

  public final boolean hZ(String paramString)
  {
    if (this.dmb.delete("videoinfo2", "filename= ?", new String[] { paramString }) > 0)
    {
      this.dnh.ae(paramString);
      this.dnh.Bo();
      return true;
    }
    return false;
  }

  public final String ib(String paramString)
  {
    String str;
    if (ch.jb(paramString))
      str = null;
    do
    {
      return str;
      str = this.dGk + paramString;
    }
    while (c.ac(str));
    return str + ".mp4";
  }

  public final String ic(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    return this.dGk + paramString + ".jpg";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.r
 * JD-Core Version:    0.6.2
 */