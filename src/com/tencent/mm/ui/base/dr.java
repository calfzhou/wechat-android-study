package com.tencent.mm.ui.base;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

final class dr
  implements View.OnKeyListener
{
  dr(MMTagPanel paramMMTagPanel)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i;
    if ((paramKeyEvent.getAction() == 0) && (67 == paramInt))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(MMTagPanel.a(this.jcy).getSelectionStart());
      arrayOfObject[1] = Integer.valueOf(MMTagPanel.a(this.jcy).getSelectionEnd());
      z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on del click, selection[%d, %d]", arrayOfObject);
      if ((MMTagPanel.a(this.jcy).getSelectionStart() != 0) || (MMTagPanel.a(this.jcy).getSelectionStart() != MMTagPanel.a(this.jcy).getSelectionEnd()))
        break label108;
      i = 1;
      if (i != 0)
        break label114;
    }
    label108: label114: 
    do
    {
      return false;
      i = 0;
      break;
      this.jcy.Sj();
    }
    while ((MMTagPanel.b(this.jcy) == null) || (MMTagPanel.b(this.jcy).isEmpty()));
    if ((!MMTagPanel.c(this.jcy)) && (MMTagPanel.d(this.jcy) == null))
    {
      MMTagPanel.a(this.jcy, (ei)MMTagPanel.b(this.jcy).getLast());
      this.jcy.a(MMTagPanel.d(this.jcy).jcM, false, true);
      MMTagPanel.a(this.jcy).setCursorVisible(false);
      return false;
    }
    if ((MMTagPanel.d(this.jcy) != null) && (MMTagPanel.b(this.jcy) != null) && (MMTagPanel.b(this.jcy).getLast() != null) && (!ch.jb(MMTagPanel.d(this.jcy).jcL)) && (!ch.jb(((ei)MMTagPanel.b(this.jcy).getLast()).jcL)) && (!MMTagPanel.d(this.jcy).jcL.equals(((ei)MMTagPanel.b(this.jcy).getLast()).jcL)))
    {
      z.i("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "change hight");
      this.jcy.aSO();
      MMTagPanel.a(this.jcy, (ei)MMTagPanel.b(this.jcy).getLast());
      this.jcy.a(MMTagPanel.d(this.jcy).jcM, false, true);
      MMTagPanel.a(this.jcy).setCursorVisible(false);
      return false;
    }
    String str = ((ei)MMTagPanel.b(this.jcy).getLast()).jcL;
    this.jcy.ml(str);
    if (MMTagPanel.e(this.jcy) != null)
      MMTagPanel.e(this.jcy).mC(str);
    this.jcy.aSO();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dr
 * JD-Core Version:    0.6.2
 */