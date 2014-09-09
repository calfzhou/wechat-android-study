package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class k
  implements Comparable
{
  public final ResolveInfo resolveInfo;
  public float weight;

  public k(j paramj, ResolveInfo paramResolveInfo)
  {
    this.resolveInfo = paramResolveInfo;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    k localk;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localk = (k)paramObject;
    }
    while (Float.floatToIntBits(this.weight) == Float.floatToIntBits(localk.weight));
    return false;
  }

  public final int hashCode()
  {
    return 31 + Float.floatToIntBits(this.weight);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.resolveInfo.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.k
 * JD-Core Version:    0.6.2
 */