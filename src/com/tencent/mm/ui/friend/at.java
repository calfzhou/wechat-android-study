package com.tencent.mm.ui.friend;

import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.l;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.modelfriend.w;
import com.tencent.mm.n;

final class at
  implements w
{
  at(FindMContactInviteUI paramFindMContactInviteUI)
  {
  }

  public final void notifyDataSetChanged()
  {
    if ((FindMContactInviteUI.d(this.jIB) != 2) && (FindMContactInviteUI.d(this.jIB) == 1))
    {
      FindMContactInviteUI.e(this.jIB).setText(this.jIB.getString(n.bJw));
      if (!FindMContactInviteUI.b(this.jIB).vV())
        break label265;
      if ((FindMContactInviteUI.d(this.jIB) != 1) && (FindMContactInviteUI.e(this.jIB).getVisibility() == 0) && (FindMContactInviteUI.f(this.jIB) != null))
      {
        FindMContactInviteUI.e(this.jIB).setVisibility(8);
        FindMContactInviteUI.f(this.jIB).setVisibility(0);
      }
    }
    while (true)
    {
      if ((FindMContactInviteUI.b(this.jIB).vU() <= 0) || (FindMContactInviteUI.d(this.jIB) == 1))
        break label327;
      TextView localTextView2 = FindMContactInviteUI.g(this.jIB);
      Resources localResources2 = this.jIB.getResources();
      int m = l.bqD;
      int n = FindMContactInviteUI.b(this.jIB).vU();
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(FindMContactInviteUI.b(this.jIB).vU());
      localTextView2.setText(localResources2.getQuantityString(m, n, arrayOfObject3));
      return;
      Button localButton = FindMContactInviteUI.e(this.jIB);
      FindMContactInviteUI localFindMContactInviteUI = this.jIB;
      int i = n.bJv;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(FindMContactInviteUI.b(this.jIB).getCount());
      localButton.setText(localFindMContactInviteUI.getString(i, arrayOfObject1));
      break;
      label265: if ((FindMContactInviteUI.d(this.jIB) != 1) && (FindMContactInviteUI.e(this.jIB).getVisibility() == 8) && (FindMContactInviteUI.f(this.jIB) != null))
      {
        FindMContactInviteUI.e(this.jIB).setVisibility(0);
        FindMContactInviteUI.f(this.jIB).setVisibility(8);
      }
    }
    label327: TextView localTextView1 = FindMContactInviteUI.g(this.jIB);
    Resources localResources1 = this.jIB.getResources();
    int j = l.bqE;
    int k = FindMContactInviteUI.b(this.jIB).getCount();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(FindMContactInviteUI.b(this.jIB).getCount());
    localTextView1.setText(localResources1.getQuantityString(j, k, arrayOfObject2));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.at
 * JD-Core Version:    0.6.2
 */