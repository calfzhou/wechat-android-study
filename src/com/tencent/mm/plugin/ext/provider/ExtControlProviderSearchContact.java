package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.tencent.mm.as.d;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n.af;
import com.tencent.mm.n.e;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExtControlProviderSearchContact extends ExtContentProviderBase
{
  private static final String[] eMH;
  private static List edM;
  private Cursor eMM = null;

  static
  {
    int i = 0;
    eMH = new String[] { "userId", "nickname", "avatar", "content", "msgId", "msgType" };
    edM = new ArrayList();
    String[] arrayOfString = y.dko;
    int j = arrayOfString.length;
    while (i < j)
    {
      String str = arrayOfString[i];
      edM.add(str);
      i++;
    }
    edM.add("officialaccounts");
    edM.add("helper_entry");
  }

  public static Cursor c(Cursor paramCursor)
  {
    d locald = new d(eMH, (byte)0);
    while (true)
    {
      int j;
      ByteArrayOutputStream localByteArrayOutputStream;
      try
      {
        boolean bool = paramCursor.moveToFirst();
        i = 0;
        i locali;
        if (bool)
        {
          j = i + 1;
          locali = new i();
          locali.b(paramCursor);
          if (!y.dc(locali.getUsername()))
          {
            Bitmap localBitmap = af.sL().b(locali.getUsername(), true, 0);
            if (localBitmap != null)
            {
              localByteArrayOutputStream = new ByteArrayOutputStream();
              localBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
              ar[] arrayOfar = bg.qW().oV().an(locali.getUsername(), 1);
              if ((arrayOfar == null) || (arrayOfar.length != 1))
                continue;
              Object[] arrayOfObject2 = new Object[6];
              arrayOfObject2[0] = com.tencent.mm.plugin.ext.a.a.aS((int)locali.dhv);
              arrayOfObject2[1] = locali.od();
              if (localByteArrayOutputStream != null)
                continue;
              arrayOfByte2 = null;
              arrayOfObject2[2] = arrayOfByte2;
              if (arrayOfar[0].getType() != 1)
                break label407;
              str = arrayOfar[0].getContent();
              arrayOfObject2[3] = str;
              arrayOfObject2[4] = com.tencent.mm.plugin.ext.a.a.aS(arrayOfar[0].kk());
              arrayOfObject2[5] = Integer.valueOf(com.tencent.mm.plugin.ext.b.a.q(arrayOfar[0]));
              locald.addRow(arrayOfObject2);
            }
          }
          else
          {
            if ((paramCursor.moveToNext()) && (j < 15))
              break label400;
          }
        }
        else
        {
          paramCursor.close();
          return locald;
        }
        z.w("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "get useravatar is null");
        localByteArrayOutputStream = null;
        continue;
        byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
        continue;
        z.w("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "get msginfo failed");
        Object[] arrayOfObject1 = new Object[6];
        arrayOfObject1[0] = com.tencent.mm.plugin.ext.a.a.aS((int)locali.dhv);
        arrayOfObject1[1] = locali.od();
        if (localByteArrayOutputStream == null)
        {
          localObject = null;
          arrayOfObject1[2] = localObject;
          arrayOfObject1[3] = "";
          arrayOfObject1[4] = "0";
          arrayOfObject1[5] = Integer.valueOf(0);
          locald.addRow(arrayOfObject1);
          continue;
        }
      }
      catch (Exception localException)
      {
        z.e("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", localException.getMessage());
        if (paramCursor != null)
          paramCursor.close();
        locald.close();
        return null;
      }
      byte[] arrayOfByte1 = localByteArrayOutputStream.toByteArray();
      Object localObject = arrayOfByte1;
      continue;
      label400: int i = j;
      continue;
      label407: String str = "";
    }
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
    z.d("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "query()");
    a(paramUri, getContext(), 16);
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
      z.w("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "invalid appid ! return null");
      hg(2);
      return null;
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
    {
      z.e("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "invaild selections");
      hg(3);
      return null;
    }
    String str = paramArrayOfString2[0].trim();
    if (ch.jb(str))
    {
      z.e("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "filter should not be null or nil");
      hg(3);
      return null;
    }
    Cursor localCursor = bg.qW().oT().d(str, "@micromsg.no.verify.biz.qq.com", null, edM);
    if (localCursor == null)
    {
      z.e("!64@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4waP5LQArHzgdMFdg+9QK8UOJSOmlX2dY", "cursor is null");
      hg(3);
      return null;
    }
    com.tencent.mm.pluginsdk.d.a.a locala = new com.tencent.mm.pluginsdk.d.a.a();
    locala.a(4000L, new m(this, localCursor, locala));
    if (this.eMM != null)
      hg(0);
    while (true)
    {
      return this.eMM;
      hg(4);
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact
 * JD-Core Version:    0.6.2
 */