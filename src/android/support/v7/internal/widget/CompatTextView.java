package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.p;

public class CompatTextView extends TextView
{
  public CompatTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public CompatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cwc, paramInt, 0);
    boolean bool = localTypedArray.getBoolean(p.cwd, false);
    localTypedArray.recycle();
    if (bool)
      setTransformationMethod(new aa(paramContext));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.CompatTextView
 * JD-Core Version:    0.6.2
 */