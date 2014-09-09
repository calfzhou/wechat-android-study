package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class an
{
  private DataSetObservable dJ = new DataSetObservable();

  public void B()
  {
  }

  public Parcelable C()
  {
    return null;
  }

  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
  }

  public void a(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Required method destroyItem was not overridden");
  }

  public void a(Object paramObject)
  {
  }

  public abstract boolean a(View paramView, Object paramObject);

  public int b(Object paramObject)
  {
    return -1;
  }

  public abstract int getCount();

  public void notifyDataSetChanged()
  {
    this.dJ.notifyChanged();
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.dJ.registerObserver(paramDataSetObserver);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.dJ.unregisterObserver(paramDataSetObserver);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.an
 * JD-Core Version:    0.6.2
 */