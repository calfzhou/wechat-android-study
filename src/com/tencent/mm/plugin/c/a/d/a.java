package com.tencent.mm.plugin.c.a.d;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Locale;

public final class a
{
  public static boolean Ib()
  {
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter == null)
      return false;
    return localBluetoothAdapter.isEnabled();
  }

  @Deprecated
  public static String aj(long paramLong)
  {
    int i = 0;
    byte[] arrayOfByte = new byte[6];
    for (int j = 0; j < 6; j++)
      arrayOfByte[j] = ((byte)(int)(paramLong >> 40 - (j << 3)));
    StringBuilder localStringBuilder = new StringBuilder();
    while (i < 6)
    {
      if (i != 0)
        localStringBuilder.append(":");
      int k = 0xFF & arrayOfByte[i];
      if (k < 16)
        localStringBuilder.append("0");
      localStringBuilder.append(Integer.toHexString(k));
      i++;
    }
    return localStringBuilder.toString().toUpperCase(Locale.US);
  }

  public static boolean ak(Context paramContext)
  {
    boolean bool = paramContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(bool);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLfStA1isVf5NMDtihauwwzA==", "isBLESupported, ret = %b", arrayOfObject);
    return bool;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.d.a
 * JD-Core Version:    0.6.2
 */