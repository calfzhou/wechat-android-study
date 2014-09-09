package com.tencent.mm.modelstat;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bt;
import com.tencent.mm.sdk.platformtools.bx;
import com.tencent.mm.sdk.platformtools.by;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import junit.framework.Assert;

public final class j extends ai
  implements by
{
  private static final String[] dSI = { "realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut" };
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) " };
  private long dEE;
  private bt dEF;
  private long dSH;
  private h dmb;

  public j(h paramh)
  {
    this.dmb = paramh;
    this.dEF = new bt(this, bg.qQ().getLooper(), 30, 2, 300000L, 60000L);
    HashSet localHashSet = new HashSet();
    String[] arrayOfString1 = dSI;
    int i = arrayOfString1.length;
    for (int j = 0; j < i; j++)
      localHashSet.add(arrayOfString1[j]);
    Cursor localCursor = this.dmb.rawQuery("PRAGMA table_info(netstat);", null);
    int k = localCursor.getColumnIndex("name");
    while (localCursor.moveToNext())
      localHashSet.remove(localCursor.getString(k));
    localCursor.close();
    for (String str1 : dSI)
      if (localHashSet.contains(str1))
      {
        String str2 = "ALTER TABLE netstat ADD COLUMN " + str1 + " INT;";
        this.dmb.bp("netstat", str2);
      }
    this.dSH = System.currentTimeMillis();
  }

  private boolean c(f paramf)
  {
    Assert.assertNotNull(paramf);
    if (paramf.dDW > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      return this.dEF.f(Integer.valueOf(paramf.dDW), paramf);
    }
  }

  public final void Ae()
  {
    int i = (int)(ch.CO() / 86400000L);
    if (ex(i) != null)
      return;
    f localf = new f();
    localf.dDW = i;
    localf.id = -1;
    c(localf);
  }

  public final long Af()
  {
    this.dEF.en(true);
    int i = (int)(ch.CO() / 86400000L);
    Cursor localCursor = this.dmb.rawQuery("SELECT peroid FROM netstat  WHERE peroid <  ( SELECT MAX ( peroid ) FROM netstat)", null);
    if (localCursor.moveToFirst())
      i = localCursor.getInt(localCursor.getColumnIndex("peroid"));
    localCursor.close();
    return 86400000L * i;
  }

  public final boolean Ag()
  {
    if (this.dmb.inTransaction())
    {
      z.i("!32@/B4Tb64lLpKaLNAssnLXZm7wD8ibTC7s", "summer preAppend inTransaction return false");
      return false;
    }
    this.dEE = this.dmb.dc(Thread.currentThread().getId());
    if (this.dEE <= 0L)
    {
      z.i("!32@/B4Tb64lLpKaLNAssnLXZm7wD8ibTC7s", "summer preAppend ticket: " + this.dEE + " return false");
      return false;
    }
    return true;
  }

  public final void Ah()
  {
    if (this.dEE > 0L)
      this.dmb.dd(this.dEE);
  }

  public final void Ai()
  {
    long l = System.currentTimeMillis();
    this.dEF.en(true);
    z.i("!32@/B4Tb64lLpKaLNAssnLXZm7wD8ibTC7s", "summer net appendAllToDisk end takes: " + (System.currentTimeMillis() - l) + " ms");
  }

  public final void a(bx parambx)
  {
    int i = parambx.igg;
    f localf = (f)parambx.values;
    int j;
    ContentValues localContentValues;
    if ((localf != null) && (i == 1))
    {
      j = localf.dDW;
      int k = localf.id;
      if (j > 0)
      {
        localContentValues = localf.ir();
        if (k >= 0)
          break label70;
        localf.id = ((int)this.dmb.insert("netstat", "id", localContentValues));
      }
    }
    return;
    label70: this.dmb.update("netstat", localContentValues, "peroid=" + j, null);
  }

  public final void b(f paramf)
  {
    Assert.assertNotNull(paramf);
    long l = System.currentTimeMillis();
    if (paramf.dDW <= 0)
      paramf.dDW = ((int)(l / 86400000L));
    if (paramf.dDW <= 0)
      return;
    f localf = ex(paramf.dDW);
    if ((localf != null) && (paramf.dDW == localf.dDW))
    {
      paramf.a(localf);
      paramf.id = localf.id;
      if (l - this.dSH > 300000L)
        z.i("!32@/B4Tb64lLpKaLNAssnLXZm7wD8ibTC7s", paramf.toString());
    }
    while (true)
    {
      this.dSH = l;
      c(paramf);
      return;
      paramf.db(0x2 | paramf.ss());
      paramf.id = -1;
      if (localf != null)
        z.i("!32@/B4Tb64lLpKaLNAssnLXZm7wD8ibTC7s", localf.toString());
      else
        z.i("!32@/B4Tb64lLpKaLNAssnLXZm7wD8ibTC7s", "NetStat started.");
    }
  }

  public final f ex(int paramInt)
  {
    f localf = (f)this.dEF.get(Integer.valueOf(paramInt));
    if (localf == null)
    {
      localCursor = this.dmb.a("netstat", null, "peroid = " + paramInt, null, null, null);
      if (localCursor.moveToFirst())
      {
        localf = new f();
        localf.b(localCursor);
      }
      localCursor.close();
      if (localf != null)
        this.dEF.f(Integer.valueOf(paramInt), localf);
    }
    while (localf.dDW == paramInt)
    {
      Cursor localCursor;
      return localf;
      this.dEF.f(Integer.valueOf(paramInt), new f().zU());
      return localf;
    }
    return null;
  }

  public final void ey(int paramInt)
  {
    this.dEF.clear();
    this.dmb.delete("netstat", null, null);
    f localf = new f();
    localf.dDW = paramInt;
    localf.id = -1;
    c(localf);
  }

  public final f ez(int paramInt)
  {
    this.dEF.en(true);
    String str = "SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= " + paramInt;
    Cursor localCursor = this.dmb.rawQuery(str, null);
    boolean bool = localCursor.moveToFirst();
    f localf = null;
    if (bool)
    {
      localf = new f();
      localf.b(localCursor);
    }
    localCursor.close();
    return localf;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.j
 * JD-Core Version:    0.6.2
 */