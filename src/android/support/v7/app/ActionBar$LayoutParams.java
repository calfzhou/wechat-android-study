package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.mm.p;

public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public int gravity = -1;

  public ActionBar$LayoutParams()
  {
    this(19);
  }

  private ActionBar$LayoutParams(int paramInt)
  {
    super(-2, -1);
    this.gravity = 19;
  }

  public ActionBar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvl);
    this.gravity = localTypedArray.getInt(p.cvm, -1);
    localTypedArray.recycle();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBar.LayoutParams
 * JD-Core Version:    0.6.2
 */