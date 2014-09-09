package com.tencent.mm.modelsearch;

import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import java.util.Comparator;
import java.util.HashMap;

public final class d
  implements Comparator
{
  private HashMap dBJ = null;
  private h dBK = null;
  private String[] dBL = null;

  private Long ho(String paramString)
  {
    Cursor localCursor;
    if (this.dBJ == null)
    {
      this.dBJ = new HashMap();
      this.dBK = bg.qW().oO();
      this.dBL = new String[1];
      this.dBL[0] = paramString;
      localCursor = this.dBK.rawQuery("SELECT conversationTime FROM rconversation WHERE username=?;", this.dBL);
      if (!localCursor.moveToFirst())
        break label116;
    }
    label116: for (Long localLong2 = Long.valueOf(localCursor.getLong(0)); ; localLong2 = Long.valueOf(0L))
    {
      localCursor.close();
      this.dBJ.put(paramString, localLong2);
      return localLong2;
      Long localLong1 = (Long)this.dBJ.get(paramString);
      if (localLong1 == null)
        break;
      return localLong1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsearch.d
 * JD-Core Version:    0.6.2
 */