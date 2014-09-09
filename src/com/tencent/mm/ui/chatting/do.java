package com.tencent.mm.ui.chatting;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class do
{
  private static final LinearLayout.LayoutParams joV = new LinearLayout.LayoutParams(-1, -2);

  private static String Ce(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    while (localStringBuilder.length() < 80)
      localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }

  private static boolean a(LinearLayout paramLinearLayout, SpannableString paramSpannableString, List paramList)
  {
    z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "addLines, nodeList size = " + paramList.size());
    int i = paramSpannableString.length();
    Iterator localIterator = paramList.iterator();
    dp localdp;
    for (int j = 0; localIterator.hasNext(); j = localdp.offset)
    {
      localdp = (dp)localIterator.next();
      if (localdp.offset > j)
      {
        TextView localTextView2 = new TextView(paramLinearLayout.getContext());
        localTextView2.setText(paramSpannableString.subSequence(j, Math.min(localdp.offset, i)));
        localTextView2.setLineSpacing(3.0F, 1.0F);
        paramLinearLayout.addView(localTextView2, joV);
      }
      TextView localTextView3 = new TextView(paramLinearLayout.getContext());
      localTextView3.setText(Ce(localdp.joZ));
      localTextView3.setSingleLine(true);
      if (localdp.joW != 14)
        localTextView3.setTextSize(localdp.joW);
      if (localdp.joX)
        localTextView3.setTypeface(null, 1);
      if (localdp.joY)
        localTextView3.setPaintFlags(0x8 | localTextView3.getPaintFlags());
      localTextView3.setTextColor(localdp.color);
      paramLinearLayout.addView(localTextView3, joV);
    }
    if (j >= i)
    {
      z.i("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "addLines, lastOffset >= maxLength, lastOffset = " + j + ", maxLength = " + i);
      return true;
    }
    TextView localTextView1 = new TextView(paramLinearLayout.getContext());
    localTextView1.setText(paramSpannableString.subSequence(j, i));
    localTextView1.setLineSpacing(2.0F, 1.0F);
    paramLinearLayout.addView(localTextView1, joV);
    return true;
  }

  public static boolean a(LinearLayout paramLinearLayout, Map paramMap)
  {
    if (paramLinearLayout == null)
    {
      z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateStyle fail, digestLl is null");
      return false;
    }
    String str1 = (String)paramMap.get(".msg.appmsg.mmreader.category.item.digest");
    if (ch.jb(str1))
    {
      z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateStyle, digest is null");
      return false;
    }
    SpannableString localSpannableString = new SpannableString(str1);
    localSpannableString.setSpan(new ForegroundColorSpan(-16777216), 0, localSpannableString.length(), 17);
    int i = 0;
    StringBuilder localStringBuilder1 = new StringBuilder(".msg.appmsg.mmreader.category.item.styles.style");
    String str2;
    label93: String str3;
    int i3;
    ArrayList localArrayList;
    StringBuilder localStringBuilder2;
    if (i == 0)
    {
      str2 = "";
      str3 = str2;
      if (paramMap.containsKey(str3))
        break label244;
      z.i("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateStyle end, total style count = " + i);
      i3 = 0;
      localArrayList = new ArrayList();
      localStringBuilder2 = new StringBuilder(".msg.appmsg.mmreader.category.item.styles.line");
      if (i3 != 0)
        break label829;
    }
    String str5;
    label829: for (String str4 = ""; ; str4 = String.valueOf(i3))
    {
      str5 = str4;
      if (paramMap.containsKey(str5))
        break label839;
      z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateStyle end, total line count = " + i3);
      Collections.sort(localArrayList);
      paramLinearLayout.removeAllViews();
      a(paramLinearLayout, localSpannableString, localArrayList);
      return true;
      str2 = String.valueOf(i);
      break label93;
      label244: dq localdq = dq.j(paramMap, str3);
      if (localdq == null)
        z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "parseFrom fail, skip to next, styleKey = " + str3);
      while (true)
      {
        i++;
        break;
        if (localdq.jpa >= localdq.jpb)
        {
          z.w("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "addStyle, no need to add, rangeFrom = " + localdq.jpa + ", rangeTo = " + localdq.jpb);
        }
        else
        {
          int j = localdq.jpa;
          int k = localdq.jpb;
          int m = localdq.joW;
          boolean bool1 = localdq.joX;
          boolean bool2 = localdq.joY;
          z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "setFont, rangeFrom = " + j + ", rangeTo = " + k + ", fontSize = " + m + ", isBlack = " + bool1 + ", isUnderLine = " + bool2);
          if (j < 0)
          {
            Object[] arrayOfObject4 = new Object[3];
            arrayOfObject4[0] = Integer.valueOf(localSpannableString.length());
            arrayOfObject4[1] = Integer.valueOf(j);
            arrayOfObject4[2] = Integer.valueOf(k);
            z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "setFont, params error. length:%d, from:%d, to:%d", arrayOfObject4);
            j = 0;
          }
          if (k > localSpannableString.length())
          {
            Object[] arrayOfObject3 = new Object[3];
            arrayOfObject3[0] = Integer.valueOf(localSpannableString.length());
            arrayOfObject3[1] = Integer.valueOf(j);
            arrayOfObject3[2] = Integer.valueOf(k);
            z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "setFont, params error. length:%d, from:%d, to:%d", arrayOfObject3);
            k = localSpannableString.length();
          }
          if (bool1)
            localSpannableString.setSpan(new StyleSpan(1), j, k, 17);
          if (bool2)
            localSpannableString.setSpan(new UnderlineSpan(), j, k, 17);
          if (m != 14)
            localSpannableString.setSpan(new AbsoluteSizeSpan(m), j, k, 17);
          int n = localdq.jpa;
          int i1 = localdq.jpb;
          int i2 = localdq.color;
          z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "setColor, rangeFrom = " + n + ", rangeTo = " + i1 + ", color = " + i2);
          if (n < 0)
          {
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Integer.valueOf(localSpannableString.length());
            arrayOfObject2[1] = Integer.valueOf(n);
            arrayOfObject2[2] = Integer.valueOf(i1);
            z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "setColor, params error. length:%d, from:%d, to:%d", arrayOfObject2);
            n = 0;
          }
          if (i1 > localSpannableString.length())
          {
            Object[] arrayOfObject1 = new Object[3];
            arrayOfObject1[0] = Integer.valueOf(localSpannableString.length());
            arrayOfObject1[1] = Integer.valueOf(n);
            arrayOfObject1[2] = Integer.valueOf(i1);
            z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "setColor, params error. length:%d, from:%d, to:%d", arrayOfObject1);
            i1 = localSpannableString.length();
          }
          localSpannableString.setSpan(new ForegroundColorSpan(i2), n, i1, 17);
        }
      }
    }
    label839: dp localdp = dp.i(paramMap, str5);
    if (localdp == null)
      z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "parseFrom fail, skip to next, lineKey = " + str5);
    while (true)
    {
      i3++;
      break;
      localArrayList.add(localdp);
    }
  }

  public static boolean a(ChattingItemDyeingTemplateTopView paramChattingItemDyeingTemplateTopView, Map paramMap)
  {
    if (paramChattingItemDyeingTemplateTopView == null)
    {
      z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateTopColor fail, target view is null");
      return false;
    }
    String str = (String)paramMap.get(".msg.appmsg.mmreader.category.item.styles.topColor");
    if (ch.jb(str))
    {
      z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateTopColor fail, color is null");
      paramChattingItemDyeingTemplateTopView.setColor(-1);
      return false;
    }
    int i = as(str, -1);
    z.d("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "decorateTopColor, color(hex) = " + Integer.toHexString(i));
    paramChattingItemDyeingTemplateTopView.setColor(i);
    return true;
  }

  private static int as(String paramString, int paramInt)
  {
    if (ch.jb(paramString))
      return paramInt;
    try
    {
      int i = Color.parseColor(paramString);
      return i;
    }
    catch (Exception localException)
    {
      z.e("!64@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DGxBoMTU5D77ZcwHNToscGW", "parseFrom, ex = " + localException.getMessage());
    }
    return paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.do
 * JD-Core Version:    0.6.2
 */