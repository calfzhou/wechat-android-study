package com.tencent.mm.s;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.al;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.z;

public final class g extends al
{
  public final boolean cG(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 620758015);
  }

  public final String getTag()
  {
    return "!56@/B4Tb64lLpKaTYYw/uq2BbQ6T0F54F6P8ob80rRHoVPXP0vwTn05QA==";
  }

  public final void transfer(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!56@/B4Tb64lLpKaTYYw/uq2BbQ6T0F54F6P8ob80rRHoVPXP0vwTn05QA==", "the previous version is %d", arrayOfObject);
    h localh = bg.qW().oO();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select username from rconversation");
    localStringBuilder.append(" where flag & 4611686018427387904").append(" != 0");
    z.d("!56@/B4Tb64lLpKaTYYw/uq2BbQ6T0F54F6P8ob80rRHoVPXP0vwTn05QA==", "sql:%s", new Object[] { localStringBuilder });
    Cursor localCursor = localh.rawQuery(localStringBuilder.toString(), null);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      while (localCursor.moveToNext())
      {
        String str = localCursor.getString(0);
        z.v("!56@/B4Tb64lLpKaTYYw/uq2BbQ6T0F54F6P8ob80rRHoVPXP0vwTn05QA==", "userName %s", new Object[] { str });
        y.d(str, false);
      }
      localCursor.close();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.g
 * JD-Core Version:    0.6.2
 */