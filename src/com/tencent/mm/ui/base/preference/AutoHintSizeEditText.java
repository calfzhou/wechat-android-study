package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.mm.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public class AutoHintSizeEditText extends EditText
{
  private float jgl;
  private Paint jgm;
  private String jgn = "";
  private int jgo = -2147483648;
  private float jgp;

  public AutoHintSizeEditText(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public AutoHintSizeEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void a(Editable paramEditable, CharSequence paramCharSequence, int paramInt)
  {
    if ((paramEditable != null) && (!ch.jb(paramEditable.toString())))
      if (getTextSize() != this.jgl)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Float.valueOf(this.jgl);
        z.v("!44@/B4Tb64lLpJ35X5sq1eLkCCYNt3aqEXpCjPTzL4P68w=", "content not null, reset text size %f", arrayOfObject4);
        setTextSize(0, this.jgl);
      }
    while (true)
    {
      return;
      if ((paramCharSequence == null) || (ch.jb(paramCharSequence.toString())))
      {
        if (getTextSize() != this.jgl)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Float.valueOf(this.jgl);
          z.v("!44@/B4Tb64lLpJ35X5sq1eLkCCYNt3aqEXpCjPTzL4P68w=", "hint is null, reset text size %f", arrayOfObject1);
          setTextSize(0, this.jgl);
        }
      }
      else
      {
        String str = paramCharSequence.toString();
        if ((this.jgn.equals(str)) && (this.jgo == paramInt))
        {
          if (getTextSize() != this.jgp)
          {
            Object[] arrayOfObject3 = new Object[1];
            arrayOfObject3[0] = Float.valueOf(this.jgp);
            z.v("!44@/B4Tb64lLpJ35X5sq1eLkCCYNt3aqEXpCjPTzL4P68w=", "use last hint text size %f", arrayOfObject3);
            setTextSize(0, this.jgp);
          }
        }
        else
        {
          this.jgn = str;
          this.jgo = paramInt;
          if (getPaint().measureText(str) > paramInt)
          {
            int i = getResources().getDimensionPixelSize(g.PR);
            int j = com.tencent.mm.aq.a.fromDPToPix(getContext(), 1);
            int k = (int)this.jgl - j;
            while (k > i)
            {
              this.jgm.setTextSize(k);
              if (this.jgm.measureText(str) < paramInt)
              {
                Object[] arrayOfObject2 = new Object[1];
                arrayOfObject2[0] = Integer.valueOf(k);
                z.v("!44@/B4Tb64lLpJ35X5sq1eLkCCYNt3aqEXpCjPTzL4P68w=", "get new hint text size %d", arrayOfObject2);
                this.jgp = k;
                setTextSize(0, k);
                return;
              }
              k -= j;
            }
          }
        }
      }
    }
  }

  private void init()
  {
    this.jgl = getTextSize();
    this.jgp = this.jgl;
    this.jgm = new Paint(getPaint());
    addTextChangedListener(new a(this));
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.d("!44@/B4Tb64lLpJ35X5sq1eLkCCYNt3aqEXpCjPTzL4P68w=", "on layout, changed %B", arrayOfObject);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
      a(getText(), getHint(), paramInt3 - paramInt1 - getPaddingLeft() - getPaddingRight());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.AutoHintSizeEditText
 * JD-Core Version:    0.6.2
 */