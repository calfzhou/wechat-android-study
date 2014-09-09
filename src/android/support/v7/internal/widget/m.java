package android.support.v7.internal.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class m
{
  public final ComponentName nM;
  public final long time;
  public final float weight;

  public m(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.nM = paramComponentName;
    this.time = paramLong;
    this.weight = paramFloat;
  }

  public m(String paramString, long paramLong, float paramFloat)
  {
    this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    m localm;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localm = (m)paramObject;
      if (this.nM == null)
      {
        if (localm.nM != null)
          return false;
      }
      else if (!this.nM.equals(localm.nM))
        return false;
      if (this.time != localm.time)
        return false;
    }
    while (Float.floatToIntBits(this.weight) == Float.floatToIntBits(localm.weight));
    return false;
  }

  public final int hashCode()
  {
    if (this.nM == null);
    for (int i = 0; ; i = this.nM.hashCode())
      return 31 * (31 * (i + 31) + (int)(this.time ^ this.time >>> 32)) + Float.floatToIntBits(this.weight);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("; activity:").append(this.nM);
    localStringBuilder.append("; time:").append(this.time);
    localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.m
 * JD-Core Version:    0.6.2
 */