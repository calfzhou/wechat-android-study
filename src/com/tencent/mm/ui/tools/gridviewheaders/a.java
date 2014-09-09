package com.tencent.mm.ui.tools.gridviewheaders;

import android.content.Context;
import com.tencent.mm.n;
import java.util.Calendar;
import java.util.Date;

public class a
{
  private static a jVB;
  private long jVA;
  private long jVy;
  private long jVz;

  private a()
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.set(7, 1);
    localCalendar1.set(11, 0);
    localCalendar1.set(12, 0);
    localCalendar1.set(13, 0);
    localCalendar1.set(14, 0);
    this.jVz = localCalendar1.getTimeInMillis();
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.set(5, 1);
    localCalendar2.set(11, 0);
    localCalendar2.set(12, 0);
    localCalendar2.set(13, 0);
    localCalendar2.set(14, 0);
    this.jVA = localCalendar2.getTimeInMillis();
    this.jVy = Calendar.getInstance().getTimeInMillis();
  }

  public static a bbi()
  {
    if (jVB == null);
    try
    {
      jVB = new a();
      return jVB;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long a(Date paramDate)
  {
    if (paramDate.getTime() >= this.jVz)
      return 9223372036854775807L;
    if (paramDate.getTime() >= this.jVA)
      return 9223372036854775806L;
    return 100 * paramDate.getYear() + paramDate.getMonth();
  }

  public final String a(Date paramDate, Context paramContext)
  {
    if (paramDate.getTime() >= this.jVz)
      return paramContext.getString(n.cmo);
    if (paramDate.getTime() >= this.jVA)
      return paramContext.getString(n.cmn);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(1900 + paramDate.getYear());
    arrayOfObject[1] = Integer.valueOf(1 + paramDate.getMonth());
    return String.format("%d/%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.a
 * JD-Core Version:    0.6.2
 */