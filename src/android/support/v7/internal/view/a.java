package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import com.tencent.mm.d;
import com.tencent.mm.e;
import com.tencent.mm.g;
import com.tencent.mm.j;
import com.tencent.mm.p;

public final class a
{
  private Context mContext;

  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public static a d(Context paramContext)
  {
    return new a(paramContext);
  }

  public final int bd()
  {
    return this.mContext.getResources().getInteger(j.baf);
  }

  public final int be()
  {
    return this.mContext.getResources().getDisplayMetrics().widthPixels / 2;
  }

  public final boolean bf()
  {
    return this.mContext.getResources().getBoolean(e.NK);
  }

  public final int bg()
  {
    TypedArray localTypedArray = this.mContext.obtainStyledAttributes(null, p.cuS, d.actionBarStyle, 0);
    int i = localTypedArray.getLayoutDimension(p.cuY, 0);
    Resources localResources = this.mContext.getResources();
    if (!bf())
      i = Math.min(i, localResources.getDimensionPixelSize(g.PS));
    localTypedArray.recycle();
    return i;
  }

  public final boolean bh()
  {
    return this.mContext.getApplicationInfo().targetSdkVersion < 14;
  }

  public final int bi()
  {
    return this.mContext.getResources().getDimensionPixelSize(g.PT);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.a
 * JD-Core Version:    0.6.2
 */