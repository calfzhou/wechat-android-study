package com.tencent.mm.n;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.a.d;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.f.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;

public final class y extends ai
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS img_flag ( username VARCHAR(40) PRIMARY KEY , imgflag int , lastupdatetime int , reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )" };
  private h dmb;
  private final d dnK = new d(800);

  public y(h paramh)
  {
    this.dmb = paramh;
  }

  public final boolean a(x paramx)
  {
    if (fg(paramx.getUsername()) == null)
    {
      this.dnK.b(paramx.getUsername(), paramx);
      if ((paramx != null) && (paramx.getUsername() != null));
      for (boolean bool2 = true; ; bool2 = false)
      {
        Assert.assertTrue(bool2);
        paramx.dc((int)(System.currentTimeMillis() / 1000L));
        paramx.sv();
        paramx.db(-1);
        ContentValues localContentValues2 = paramx.sr();
        if ((int)this.dmb.insert("img_flag", "username", localContentValues2) < 0)
          break;
        return true;
      }
      return false;
    }
    this.dnK.remove(paramx.getUsername());
    if ((paramx != null) && (paramx.getUsername() != null));
    for (boolean bool1 = true; ; bool1 = false)
    {
      Assert.assertTrue(bool1);
      paramx.dc((int)(System.currentTimeMillis() / 1000L));
      paramx.db(0x4 | paramx.ss());
      ContentValues localContentValues1 = paramx.sr();
      h localh = this.dmb;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramx.getUsername();
      if (localh.update("img_flag", localContentValues1, "username=?", arrayOfString) > 0)
        break;
      return false;
    }
  }

  public final x fg(String paramString)
  {
    x localx1 = (x)this.dnK.get(paramString);
    if ((localx1 != null) && (localx1.getUsername().equals(paramString)))
      return localx1;
    String str = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.username=\"" + ch.iV(paramString) + "\"";
    Cursor localCursor = this.dmb.rawQuery(str, null);
    if (localCursor == null)
      return null;
    x localx2;
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      localx2 = new x();
      localx2.b(localCursor);
    }
    while (true)
    {
      localCursor.close();
      this.dnK.b(paramString, localx2);
      return localx2;
      localx2 = null;
    }
  }

  public final void fh(String paramString)
  {
    if (ch.jb(paramString))
      return;
    this.dnK.remove(paramString);
    this.dmb.delete("img_flag", "username=?", new String[] { paramString });
  }

  public final boolean g(List paramList)
  {
    if (paramList.size() == 0)
      return false;
    long l = this.dmb.dc(Thread.currentThread().getId());
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        a((x)paramList.get(i));
        i++;
      }
      bool = true;
      this.dmb.dd(l);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.e("!32@/B4Tb64lLpLEGbJGM8EbWOxStl5p9nSY", localException.getMessage());
        boolean bool = false;
      }
    }
  }

  public final void sx()
  {
    this.dnK.clear();
  }

  public final List sy()
  {
    Cursor localCursor = this.dmb.rawQuery("select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";", null);
    int i = localCursor.getCount();
    if (i == 0)
    {
      localCursor.close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    localCursor.moveToFirst();
    for (int j = 0; j < i; j++)
    {
      localCursor.moveToPosition(j);
      localArrayList.add(localCursor.getString(0));
    }
    localCursor.close();
    return localArrayList;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.y
 * JD-Core Version:    0.6.2
 */