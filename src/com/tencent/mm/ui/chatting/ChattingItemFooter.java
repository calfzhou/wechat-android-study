package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import java.util.List;

public class ChattingItemFooter extends LinearLayout
  implements View.OnClickListener
{
  private static final int[] jpe;
  private static final int[] jpf = arrayOfInt2;
  private String epd;
  private LayoutInflater gJ;
  private Context mContext;

  static
  {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1[0] = com.tencent.mm.h.Tx;
    arrayOfInt1[1] = com.tencent.mm.h.Tx;
    arrayOfInt1[2] = com.tencent.mm.h.Tz;
    arrayOfInt1[3] = com.tencent.mm.h.Ty;
    jpe = arrayOfInt1;
    int[] arrayOfInt2 = new int[4];
    arrayOfInt2[0] = com.tencent.mm.h.Zp;
    arrayOfInt2[1] = com.tencent.mm.h.Zq;
    arrayOfInt2[2] = com.tencent.mm.h.Zs;
    arrayOfInt2[3] = com.tencent.mm.h.Zr;
  }

  public ChattingItemFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    this.gJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }

  private TextView a(int paramInt1, int paramInt2, LinearLayout.LayoutParams paramLayoutParams)
  {
    if (paramInt1 < paramInt2)
      return (TextView)getChildAt(paramInt1);
    TextView localTextView = (TextView)this.gJ.inflate(k.bcp, null);
    localTextView.setLongClickable(false);
    localTextView.setOnClickListener(this);
    localTextView.setLayoutParams(paramLayoutParams);
    addView(localTextView);
    return localTextView;
  }

  private void d(com.tencent.mm.q.h paramh)
  {
    com.tencent.mm.q.z localz = new com.tencent.mm.q.z(this.epd, 1, paramh.getInfo());
    bg.qX().d(localz);
  }

  public final boolean a(List paramList, String paramString, boolean paramBoolean)
  {
    if ((paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@aT6MxGXVKYEKCYeFxaI6LH1pIYMDOA2C", "no menulist!");
      setVisibility(8);
      return false;
    }
    this.epd = paramString;
    int i = getChildCount();
    int[] arrayOfInt;
    LinearLayout.LayoutParams localLayoutParams;
    int j;
    if (paramBoolean)
    {
      arrayOfInt = jpf;
      localLayoutParams = new LinearLayout.LayoutParams(0, -1);
      localLayoutParams.weight = 1.0F;
      j = paramList.size();
      switch (j)
      {
      default:
      case 1:
      case 3:
      case 2:
      }
    }
    while (true)
    {
      if ((i > j) && (i - 1 > 0))
        removeViews(j, i - 1);
      setLongClickable(true);
      setVisibility(0);
      return true;
      arrayOfInt = jpe;
      break;
      com.tencent.mm.q.h localh4 = (com.tencent.mm.q.h)paramList.get(0);
      TextView localTextView4 = a(0, i, localLayoutParams);
      localTextView4.setText(localh4.name);
      localTextView4.setTag(localh4);
      localTextView4.setBackgroundResource(arrayOfInt[3]);
      continue;
      com.tencent.mm.q.h localh3 = (com.tencent.mm.q.h)paramList.get(1);
      TextView localTextView3 = a(1, i, localLayoutParams);
      localTextView3.setText(localh3.name);
      localTextView3.setTag(localh3);
      localTextView3.setBackgroundResource(arrayOfInt[1]);
      com.tencent.mm.q.h localh1 = (com.tencent.mm.q.h)paramList.get(0);
      TextView localTextView1 = a(0, i, localLayoutParams);
      localTextView1.setText(localh1.name);
      localTextView1.setTag(localh1);
      localTextView1.setBackgroundResource(arrayOfInt[0]);
      com.tencent.mm.q.h localh2 = (com.tencent.mm.q.h)paramList.get(j - 1);
      TextView localTextView2 = a(j - 1, i, localLayoutParams);
      localTextView2.setText(localh2.name);
      localTextView2.setTag(localh2);
      localTextView2.setBackgroundResource(arrayOfInt[2]);
    }
  }

  public void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if (!(localObject instanceof com.tencent.mm.q.h))
      return;
    com.tencent.mm.q.h localh = (com.tencent.mm.q.h)localObject;
    switch (localh.type)
    {
    default:
      return;
    case 1:
      com.tencent.mm.sdk.platformtools.z.d("!32@aT6MxGXVKYEKCYeFxaI6LH1pIYMDOA2C", "get latest message");
      localh.dqs = com.tencent.mm.q.h.dqn;
      d(localh);
      return;
    case 2:
    }
    com.tencent.mm.sdk.platformtools.z.d("!32@aT6MxGXVKYEKCYeFxaI6LH1pIYMDOA2C", "start webview url");
    localh.dqs = com.tencent.mm.q.h.dqn;
    d(localh);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", localh.value);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("geta8key_username", this.epd);
    a.b(this.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingItemFooter
 * JD-Core Version:    0.6.2
 */