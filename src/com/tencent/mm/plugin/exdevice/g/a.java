package com.tencent.mm.plugin.exdevice.g;

import com.tencent.mm.f.c;
import com.tencent.mm.f.e;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class a
{
  public static String PW()
  {
    int i = 7;
    String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    Calendar localCalendar = Calendar.getInstance();
    try
    {
      int j = Integer.parseInt(String.valueOf(localCalendar.get(7)));
      if (j == 1);
      while (true)
      {
        return str + i;
        i = j - 1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "parse day failed : %s", arrayOfObject);
        i = 0;
      }
    }
  }

  public static long PX()
  {
    String str = e.or().getValue("DeviceAutoSyncInterval");
    if (!ch.jb(str));
    while (true)
    {
      try
      {
        long l2 = Long.parseLong(str);
        l1 = l2 * 1000L;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Long.valueOf(l1);
        z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "now sync interval is %d", arrayOfObject1);
        if (l1 == 0L)
          return 7200000L;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "parse syncinterval to long failed : %s", arrayOfObject2);
        l1 = 7200000L;
        continue;
      }
      return l1;
      long l1 = 7200000L;
    }
  }

  public static long PY()
  {
    String str = e.or().getValue("DeviceAutoSyncDuration");
    if (!ch.jb(str));
    while (true)
    {
      try
      {
        long l2 = Long.parseLong(str);
        l1 = l2 * 1000L;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Long.valueOf(l1);
        z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "now sync time out is %d", arrayOfObject1);
        if (l1 == 0L)
          return 60000L;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "parse string to time out long failed : %s", arrayOfObject2);
        l1 = 60000L;
        continue;
      }
      return l1;
      long l1 = 60000L;
    }
  }

  public static String Z(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return null;
    return k(paramArrayOfByte, paramArrayOfByte.length);
  }

  public static boolean ap(String paramString1, String paramString2)
  {
    z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "isDeviceInDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)));
    while (true)
    {
      return false;
      String[] arrayOfString;
      try
      {
        arrayOfString = paramString2.split("\\|");
        if (arrayOfString == null)
        {
          z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "null == deviceArray");
          return false;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "aDeviceList.split failed, %s", arrayOfObject);
        return false;
      }
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
        if (arrayOfString[j].equalsIgnoreCase(paramString1))
          return true;
    }
  }

  public static String aq(String paramString1, String paramString2)
  {
    z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "moveDevicefromDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
    {
      z.w("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "parameters is null or nil");
      return null;
    }
    String[] arrayOfString;
    try
    {
      arrayOfString = paramString2.split("\\|");
      if (arrayOfString == null)
      {
        z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "null == strArray");
        return null;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getMessage();
      z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "aDeviceList.split failed!!!, %s", arrayOfObject);
      return null;
    }
    String str1 = new String();
    int i = arrayOfString.length;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      String str2 = arrayOfString[j];
      if (!str2.equalsIgnoreCase(paramString1))
      {
        String str3 = str1 + str2;
        str1 = str3 + "|";
      }
      while (true)
      {
        j++;
        break;
        k = 1;
      }
    }
    if (k == 0)
    {
      z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "remove failed!!!, this device is not in the list");
      return null;
    }
    z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "add device to device list successful, new device list = %s", new Object[] { paramString2 });
    return str1;
  }

  public static String k(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return null;
    if (paramArrayOfByte.length < paramInt)
    {
      z.w("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "data length is shorter then print command length");
      paramInt = paramArrayOfByte.length;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramInt; i++)
    {
      int j = 0xFF & paramArrayOfByte[i];
      if (j < 16)
        localStringBuilder.append("0");
      localStringBuilder.append(Integer.toHexString(j));
    }
    return localStringBuilder.toString().toUpperCase(Locale.US);
  }

  public static long lU(String paramString)
  {
    long l1;
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "mac string is null or nil");
      l1 = 0L;
    }
    while (true)
    {
      return l1;
      String[] arrayOfString = paramString.toUpperCase(Locale.US).split(":");
      Byte[] arrayOfByte = new Byte[arrayOfString.length];
      int i = arrayOfString.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        String str = arrayOfString[j];
        int i4;
        if ((byte)str.charAt(0) >= 65)
        {
          i4 = 10 + ('\0'7' + str.charAt(0)) << 4;
          label93: if ((byte)str.charAt(1) < 65)
            break label165;
        }
        label165: for (int i5 = 10 + ('\0'7' + str.charAt(1)); ; i5 = '\0*0' + str.charAt(1))
        {
          arrayOfByte[k] = Byte.valueOf((byte)(i4 | i5));
          int i6 = k + 1;
          j++;
          k = i6;
          break;
          i4 = '\0*0' + str.charAt(0) << 4;
          break label93;
        }
      }
      int m = -1 + arrayOfString.length;
      int n = arrayOfByte.length;
      l1 = 0L;
      int i1 = 0;
      int i2 = m;
      while (i1 < n)
      {
        long l2 = l1 | (0xFF & arrayOfByte[i1].longValue()) << (i2 << 3);
        int i3 = i2 - 1;
        i1++;
        i2 = i3;
        l1 = l2;
      }
    }
  }

  public static String lV(String paramString)
  {
    if ((paramString == null) || (12 != paramString.length()))
    {
      z.e("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "%s is not server string mac", new Object[] { paramString });
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder("");
    for (int i = 0; i < paramString.length(); i++)
    {
      localStringBuilder.append(paramString.charAt(i));
      if (i % 2 != 0)
        localStringBuilder.append(":");
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = localStringBuilder.toString();
    z.i("!32@/B4Tb64lLpLHXwcx366fGkqKP1j4Vqbm", "%s to %s is ok", arrayOfObject);
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.g.a
 * JD-Core Version:    0.6.2
 */