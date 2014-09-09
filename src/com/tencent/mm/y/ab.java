package com.tencent.mm.y;

import android.graphics.Bitmap;
import com.tencent.mm.a.d;
import com.tencent.mm.cache.a;

final class ab
  implements a
{
  private d dye = new d(5);

  public final void d(Object paramObject1, Object paramObject2)
  {
    this.dye.b((String)paramObject1, (Bitmap)paramObject2);
  }

  public final Object get(Object paramObject)
  {
    return this.dye.get((String)paramObject);
  }

  public final Object remove(Object paramObject)
  {
    this.dye.remove((String)paramObject);
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.ab
 * JD-Core Version:    0.6.2
 */