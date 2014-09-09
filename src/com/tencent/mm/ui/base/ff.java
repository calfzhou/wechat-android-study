package com.tencent.mm.ui.base;

import android.support.v4.view.an;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public abstract class ff extends an
{
  private Queue jdw = new LinkedList();
  private HashMap jdx = new HashMap();
  private SparseArray jdy = new SparseArray();

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    long l = System.currentTimeMillis();
    int i = this.jdw.size();
    View localView = null;
    if (i > 0)
      localView = (View)this.jdw.poll();
    Object localObject = e(paramInt, localView);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(localObject.hashCode());
    arrayOfObject1[1] = ((View)localObject).getParent();
    z.i("!44@/B4Tb64lLpKZ4LN+4c7XrHVaeqV45lDZOKwVPe7jRBU=", "instantiateItem object %s, parent %s", arrayOfObject1);
    this.jdx.put(localObject, Integer.valueOf(paramInt));
    this.jdy.put(paramInt, localObject);
    if (((View)localObject).getParent() == null)
      paramViewGroup.addView((View)localObject);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.i("!44@/B4Tb64lLpKZ4LN+4c7XrHVaeqV45lDZOKwVPe7jRBU=", "instantiateItem spent : %s", arrayOfObject2);
    return localObject;
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpKZ4LN+4c7XrHVaeqV45lDZOKwVPe7jRBU=", "destroyItem position %s", arrayOfObject1);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(paramObject.hashCode());
    z.i("!44@/B4Tb64lLpKZ4LN+4c7XrHVaeqV45lDZOKwVPe7jRBU=", "destroyItem object %s", arrayOfObject2);
    this.jdw.add((View)paramObject);
    this.jdx.remove(paramObject);
    this.jdy.remove(paramInt);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }

  public final SparseArray aSY()
  {
    return this.jdy;
  }

  public int aa()
  {
    return -1;
  }

  public int ab()
  {
    return -1;
  }

  public final int b(Object paramObject)
  {
    if (this.jdx.containsKey(paramObject))
      return ((Integer)this.jdx.get(paramObject)).intValue();
    return -2;
  }

  public void detach()
  {
    this.jdw.clear();
    this.jdx.clear();
    this.jdy.clear();
  }

  public abstract Object e(int paramInt, View paramView);

  public abstract MultiTouchImageView hL(int paramInt);

  public final View pL(int paramInt)
  {
    Object localObject = this.jdy.get(paramInt);
    if (localObject != null)
      return (View)localObject;
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ff
 * JD-Core Version:    0.6.2
 */