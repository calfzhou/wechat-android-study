package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;
import com.tencent.mm.n;

final class gf
  implements View.OnTouchListener
{
  gf(ShareImageRedirectUI paramShareImageRedirectUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    Toast.makeText(this.jUJ, n.ciM, 1).show();
    this.jUJ.finish();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gf
 * JD-Core Version:    0.6.2
 */