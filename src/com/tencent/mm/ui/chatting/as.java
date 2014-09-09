package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.h;

final class as
  implements View.OnClickListener
{
  as(ChatFooterCustom paramChatFooterCustom)
  {
  }

  public final void onClick(View paramView)
  {
    ChatFooterCustom.d(this.jnn).aUE();
    ImageView localImageView = (ImageView)paramView;
    if (localImageView.getTag() == null)
    {
      localImageView.setTag(new Object());
      localImageView.setImageResource(h.WV);
      int k = 0;
      if (k < ChatFooterCustom.e(this.jnn))
      {
        View localView2 = ChatFooterCustom.f(this.jnn).getChildAt(k);
        if (k >= 3);
        for (int m = 0; ; m = 8)
        {
          localView2.setVisibility(m);
          k++;
          break;
        }
      }
    }
    else
    {
      localImageView.setTag(null);
      localImageView.setImageResource(h.WU);
      int i = 0;
      if (i < ChatFooterCustom.e(this.jnn))
      {
        View localView1 = ChatFooterCustom.f(this.jnn).getChildAt(i);
        if (i < 3);
        for (int j = 0; ; j = 8)
        {
          localView1.setVisibility(j);
          i++;
          break;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.as
 * JD-Core Version:    0.6.2
 */