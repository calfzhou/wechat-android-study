package com.tencent.mm.ui.base;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.tencent.mm.ar.a;
import com.tencent.mm.ar.e;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ec
  implements InputFilter
{
  List jcB = new LinkedList();
  int mark;

  public ec(MMTagPanel paramMMTagPanel)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramCharSequence;
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = paramSpanned;
    arrayOfObject[4] = Integer.valueOf(paramInt3);
    arrayOfObject[5] = Integer.valueOf(paramInt4);
    arrayOfObject[6] = Boolean.valueOf(MMTagPanel.h(this.jcy));
    z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on create tag filter, %s [%d, %d) %s [%d, %d), maxlength[%B]", arrayOfObject);
    this.mark = -1;
    this.jcB.clear();
    char[] arrayOfChar = new char[paramInt2 - paramInt1];
    TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, arrayOfChar, 0);
    if (!MMTagPanel.i(this.jcy))
    {
      int j = 0;
      StringBuilder localStringBuilder2 = new StringBuilder();
      if (paramInt1 < paramInt2)
      {
        if (arrayOfChar[paramInt1] == '\n')
          j = 1;
        while (true)
        {
          paramInt1++;
          break;
          localStringBuilder2.append(arrayOfChar[paramInt1]);
        }
      }
      if (j != 0)
      {
        String str3 = localStringBuilder2.toString();
        localStringBuilder2.insert(0, paramSpanned.subSequence(0, paramInt3));
        localStringBuilder2.append(paramSpanned.subSequence(paramInt4, paramSpanned.length()));
        this.jcy.post(new ed(this, localStringBuilder2));
        SpannableString localSpannableString4 = new SpannableString(str3);
        e.a(this.jcy.getContext(), localSpannableString4, MMTagPanel.j(this.jcy));
        a.a(this.jcy.getContext(), localSpannableString4, MMTagPanel.j(this.jcy));
        return localSpannableString4;
      }
      SpannableString localSpannableString3 = new SpannableString(paramCharSequence);
      e.a(this.jcy.getContext(), localSpannableString3, MMTagPanel.j(this.jcy));
      a.a(this.jcy.getContext(), localSpannableString3, MMTagPanel.j(this.jcy));
      return localSpannableString3;
    }
    if (MMTagPanel.h(this.jcy))
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      while (paramInt1 < paramInt2)
      {
        if ((arrayOfChar[paramInt1] != '\n') && (arrayOfChar[paramInt1] != ',') && (arrayOfChar[paramInt1] != ';') && (arrayOfChar[paramInt1] != '、') && (arrayOfChar[paramInt1] != 65292) && (arrayOfChar[paramInt1] != 65307))
          localStringBuilder1.append(arrayOfChar[paramInt1]);
        paramInt1++;
      }
      SpannableString localSpannableString1 = new SpannableString(localStringBuilder1.toString());
      e.a(this.jcy.getContext(), localSpannableString1, MMTagPanel.j(this.jcy));
      a.a(this.jcy.getContext(), localSpannableString1, MMTagPanel.j(this.jcy));
      return localSpannableString1;
    }
    int i = paramInt1;
    if (i < paramInt2)
    {
      if ((arrayOfChar[i] == '\n') || (arrayOfChar[i] == ',') || (arrayOfChar[i] == ';') || (arrayOfChar[i] == '、') || (arrayOfChar[i] == 65292) || (arrayOfChar[i] == 65307))
      {
        if (-1 != this.mark)
          break label637;
        this.jcB.add((paramSpanned.subSequence(0, paramInt3).toString() + paramCharSequence.subSequence(paramInt1, i)).trim());
      }
      while (true)
      {
        this.mark = (i + 1);
        i++;
        break;
        label637: this.jcB.add(paramCharSequence.subSequence(this.mark, i).toString().trim());
      }
    }
    if (this.jcB.isEmpty())
    {
      SpannableString localSpannableString2 = new SpannableString(paramCharSequence);
      e.a(this.jcy.getContext(), localSpannableString2, MMTagPanel.j(this.jcy));
      a.a(this.jcy.getContext(), localSpannableString2, MMTagPanel.j(this.jcy));
      return localSpannableString2;
    }
    if (MMTagPanel.e(this.jcy) != null)
    {
      Iterator localIterator = this.jcB.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (str2.length() > 0)
          this.jcy.post(new ee(this, str2));
      }
    }
    if (this.mark >= paramInt2)
      paramSpanned.length();
    for (String str1 = paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString(); ; str1 = paramCharSequence.subSequence(this.mark, paramInt2).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()))
    {
      this.jcy.post(new ef(this, str1));
      return "";
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ec
 * JD-Core Version:    0.6.2
 */