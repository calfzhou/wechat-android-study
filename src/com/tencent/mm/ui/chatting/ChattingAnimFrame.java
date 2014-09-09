package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.ar.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChattingAnimFrame extends FrameLayout
{
  List jnA = new ArrayList();
  int size = 0;

  public ChattingAnimFrame(Context paramContext)
  {
    super(paramContext);
  }

  public ChattingAnimFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  ChattingAnimFrame(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private int getSize()
  {
    if (this.size == 0)
      return (int)(1.2D * new TextView(getContext()).getTextSize());
    return this.size;
  }

  static float k(float paramFloat1, float paramFloat2)
  {
    return paramFloat1 + (float)Math.random() * (paramFloat2 - paramFloat1);
  }

  public final void g(Activity paramActivity, int paramInt)
  {
    stop();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    setVisibility(0);
    for (int i = 0; i < 30; i++)
    {
      bb localbb = new bb(this, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
      Drawable localDrawable = a.A(paramActivity, paramInt);
      if (localDrawable != null)
      {
        localDrawable.setBounds(0, 0, getSize(), getSize());
        ImageSpan localImageSpan = new ImageSpan(localDrawable, 1);
        SpannableString localSpannableString = new SpannableString("! ");
        localSpannableString.setSpan(localImageSpan, 0, 1, 33);
        TextView localTextView = new TextView(getContext());
        localTextView.setSingleLine();
        localTextView.setText(localSpannableString);
        localTextView.setAnimation(localbb);
        localTextView.setTag(localbb);
        addView(localTextView);
        ((az)localbb).targetView = localTextView;
        this.jnA.add(localTextView);
      }
    }
  }

  public final void stop()
  {
    Iterator localIterator = this.jnA.iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      localView.clearAnimation();
      removeView(localView);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingAnimFrame
 * JD-Core Version:    0.6.2
 */