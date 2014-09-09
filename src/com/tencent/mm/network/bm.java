package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.network.a.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;

public final class bm
{
  private c dUj = null;
  public boolean dUk = false;

  public static boolean a(int paramInt1, int paramInt2, Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(ak.aHi(), 0);
    if (localSharedPreferences.getBoolean("settings_active_time_full", true));
    int i;
    int j;
    int k;
    int m;
    do
    {
      do
      {
        do
        {
          return true;
          i = localSharedPreferences.getInt("settings_active_begin_time_hour", 8);
          j = localSharedPreferences.getInt("settings_active_begin_time_min", 0);
          k = localSharedPreferences.getInt("settings_active_end_time_hour", 23);
          m = localSharedPreferences.getInt("settings_active_end_time_min", 0);
          if ((i == k) && (j == m))
            return false;
          if ((i != k) || (j >= m))
            break;
        }
        while ((paramInt1 == i) && (paramInt2 > j) && (paramInt2 < m));
        return false;
        if (k <= i)
          break;
      }
      while (((paramInt1 > i) && (paramInt1 < k)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)));
      return false;
    }
    while (((k >= i) && ((i != k) || (j <= m))) || ((paramInt1 > i) && (paramInt1 <= 23)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)) || ((paramInt1 > 0) && (paramInt1 < k)));
    return false;
  }

  public static boolean ab(Context paramContext)
  {
    return (paramContext != null) && (bc.bP(paramContext));
  }

  public final c Dr()
  {
    return this.dUj;
  }

  public final void a(c paramc)
  {
    this.dUj = paramc;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bm
 * JD-Core Version:    0.6.2
 */