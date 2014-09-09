package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bs;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.a.b;

public final class s extends b
{
  protected bs iWM = null;

  public s(Context paramContext, bs parambs)
  {
    super(paramContext);
    this.iWM = parambs;
    ImageView localImageView;
    TextView localTextView;
    View localView;
    int i;
    int j;
    Object localObject;
    if (this.view != null)
    {
      localImageView = (ImageView)this.view.findViewById(i.aBn);
      localTextView = (TextView)this.view.findViewById(i.aBo);
      switch (this.iWM.getType())
      {
      default:
        localView = this.view;
        i = this.iWM.getType();
        j = this.iWM.rm();
        switch (i)
        {
        default:
          localObject = null;
        case 5:
        case 4:
        case 3:
        case 1:
        case 2:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      }
    }
    while (true)
    {
      localView.setOnClickListener((View.OnClickListener)localObject);
      return;
      localImageView.setImageResource(h.acz);
      localTextView.setText(n.bvO);
      break;
      localImageView.setImageResource(h.acz);
      localTextView.setText(n.bJo);
      break;
      localImageView.setImageResource(h.acy);
      localTextView.setText(n.bvU);
      break;
      localImageView.setImageResource(h.acF);
      localTextView.setText(n.bvP);
      break;
      localImageView.setImageResource(h.acC);
      localTextView.setText(n.bvN);
      break;
      localImageView.setImageResource(h.acA);
      localTextView.setText(n.bvS);
      break;
      localImageView.setImageResource(h.acB);
      localTextView.setText(n.bvR);
      break;
      localImageView.setImageResource(h.acD);
      localTextView.setText(n.bvT);
      break;
      localImageView.setImageResource(h.acE);
      localTextView.setText(n.bvQ);
      break;
      localImageView.setImageResource(h.acx);
      localTextView.setText(n.bvM);
      break;
      localObject = new t(this, i, j);
      continue;
      localObject = new v(this, i, j);
      continue;
      localObject = new w(this, i, j);
      continue;
      localObject = new x(this, i, j);
      continue;
      localObject = new y(this, i, j);
      continue;
      localObject = new z(this, i, j);
      continue;
      localObject = new aa(this, i, j);
      continue;
      localObject = new ab(this, i, j);
      continue;
      localObject = new ac(this, i, j);
      continue;
      localObject = new u(this, i, j);
    }
  }

  public final int getLayoutId()
  {
    return k.bhw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.s
 * JD-Core Version:    0.6.2
 */