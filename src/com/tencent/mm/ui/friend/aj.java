package com.tencent.mm.ui.friend;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.l;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.modelfriend.w;
import com.tencent.mm.n;

final class aj
  implements w
{
  aj(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final void notifyDataSetChanged()
  {
    if ((FindMContactAddUI.e(this.jIz) != 2) && (FindMContactAddUI.e(this.jIz) == 1))
    {
      FindMContactAddUI.f(this.jIz).setText(this.jIz.getString(n.bJn));
      if (!FindMContactAddUI.c(this.jIz).vV())
        break label265;
      if ((FindMContactAddUI.e(this.jIz) != 1) && (FindMContactAddUI.f(this.jIz).getVisibility() == 0) && (FindMContactAddUI.g(this.jIz) != null))
      {
        FindMContactAddUI.f(this.jIz).setVisibility(8);
        FindMContactAddUI.g(this.jIz).setVisibility(0);
      }
    }
    while (true)
    {
      if ((FindMContactAddUI.c(this.jIz).vU() <= 0) || (FindMContactAddUI.e(this.jIz) == 1))
        break label327;
      TextView localTextView2 = FindMContactAddUI.h(this.jIz);
      Resources localResources2 = this.jIz.getResources();
      int m = l.bqC;
      int n = FindMContactAddUI.c(this.jIz).vU();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(FindMContactAddUI.c(this.jIz).vU());
      localTextView2.setText(localResources2.getQuantityString(m, n, arrayOfObject3));
      return;
      Button localButton = FindMContactAddUI.f(this.jIz);
      FindMContactAddUI localFindMContactAddUI = this.jIz;
      int i = n.bJm;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(FindMContactAddUI.c(this.jIz).getCount());
      localButton.setText(localFindMContactAddUI.getString(i, arrayOfObject1));
      break;
      label265: if ((FindMContactAddUI.e(this.jIz) != 1) && (FindMContactAddUI.f(this.jIz).getVisibility() == 8) && (FindMContactAddUI.g(this.jIz) != null))
      {
        FindMContactAddUI.f(this.jIz).setVisibility(0);
        FindMContactAddUI.g(this.jIz).setVisibility(8);
      }
    }
    label327: TextView localTextView1 = FindMContactAddUI.h(this.jIz);
    Resources localResources1 = this.jIz.getResources();
    int j = l.bqF;
    int k = FindMContactAddUI.c(this.jIz).getCount();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(FindMContactAddUI.c(this.jIz).getCount());
    localTextView1.setText(localResources1.getQuantityString(j, k, arrayOfObject2));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.aj
 * JD-Core Version:    0.6.2
 */