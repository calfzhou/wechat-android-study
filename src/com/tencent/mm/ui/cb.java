package com.tencent.mm.ui;

import android.content.Context;
import android.database.Cursor;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class cb extends BaseAdapter
  implements al, as
{
  protected Context context;
  private int count;
  protected Object iLm;
  private Cursor iLn = null;
  protected Map iLo = null;
  protected cc iLp;

  public cb(Context paramContext, Object paramObject)
  {
    this.iLm = paramObject;
    this.context = paramContext;
    this.count = -1;
  }

  public abstract void DW();

  protected abstract void DX();

  public abstract Object a(Object paramObject, Cursor paramCursor);

  public void a(int paramInt, ap paramap, Object paramObject)
  {
    a((String)paramObject, null);
  }

  public final void a(cc paramcc)
  {
    this.iLp = paramcc;
  }

  public void a(String paramString, ao paramao)
  {
    if (this.iLp != null)
      this.iLp.DU();
    closeCursor();
    DW();
    if (this.iLp != null)
      this.iLp.DT();
  }

  public final void aOD()
  {
    this.iLp = null;
  }

  protected final int aPA()
  {
    if (this.count < 0)
      this.count = getCursor().getCount();
    return this.count;
  }

  protected final Object aPB()
  {
    return this.iLm;
  }

  public final void aPz()
  {
    if (this.iLo == null)
      this.iLo = new HashMap();
  }

  protected int apd()
  {
    return 0;
  }

  public final void closeCursor()
  {
    if (this.iLo != null)
      this.iLo.clear();
    if (this.iLn != null)
      this.iLn.close();
    this.count = -1;
  }

  public int getCount()
  {
    if (this.count < 0)
      this.count = getCursor().getCount();
    return this.count + apd();
  }

  protected final Cursor getCursor()
  {
    if ((this.iLn == null) || (this.iLn.isClosed()))
    {
      DX();
      Assert.assertNotNull(this.iLn);
    }
    return this.iLn;
  }

  public Object getItem(int paramInt)
  {
    Object localObject2;
    if (oL(paramInt))
      localObject2 = this.iLm;
    do
    {
      return localObject2;
      if (this.iLo == null)
        break;
      localObject2 = this.iLo.get(Integer.valueOf(paramInt));
    }
    while (localObject2 != null);
    if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
      return null;
    if (this.iLo == null)
      return a(this.iLm, getCursor());
    Object localObject1 = a(null, getCursor());
    this.iLo.put(Integer.valueOf(paramInt), localObject1);
    return localObject1;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public final boolean oL(int paramInt)
  {
    return (paramInt >= this.count) && (paramInt < this.count + apd());
  }

  protected final void setCursor(Cursor paramCursor)
  {
    this.iLn = paramCursor;
    this.count = -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cb
 * JD-Core Version:    0.6.2
 */