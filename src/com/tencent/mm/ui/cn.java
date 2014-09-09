package com.tencent.mm.ui;

import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;

final class cn
  implements Runnable
{
  cn(cg paramcg, boolean paramBoolean, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    View localView = cg.b(this.iMo);
    int i;
    String str2;
    if (this.val$visible)
    {
      i = 0;
      localView.setVisibility(i);
      String str1 = cg.c(this.iMo).getString(n.bOR);
      if (!ch.jb(this.fFH))
        break label166;
      str2 = cg.c(this.iMo).getString(n.bOQ);
      label61: if (this.esU == null)
        break label175;
      SpannableString localSpannableString = new SpannableString(str2 + str1);
      localSpannableString.setSpan(new ForegroundColorSpan(-10119449), str2.length(), str2.length() + str1.length(), 33);
      cg.d(this.iMo).setText(localSpannableString);
    }
    while (true)
    {
      cg.b(this.iMo).invalidate();
      cg.e(this.iMo).invalidate();
      return;
      i = 8;
      break;
      label166: str2 = this.fFH;
      break label61;
      label175: cg.d(this.iMo).setText(str2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cn
 * JD-Core Version:    0.6.2
 */