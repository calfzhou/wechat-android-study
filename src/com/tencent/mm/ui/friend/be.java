package com.tencent.mm.ui.friend;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.a.k;

public final class be
  implements View.OnClickListener
{
  private Context context;
  private bg jIH;

  public be(Context paramContext, bg parambg)
  {
    this.context = paramContext;
    this.jIH = parambg;
  }

  public final void onClick(View paramView)
  {
    bh localbh = (bh)paramView.getTag();
    String str = localbh.jIJ;
    int i = localbh.position;
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = k.ai(str);
    new ck(this.context, new bf(this, i)).f(arrayOfInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.be
 * JD-Core Version:    0.6.2
 */