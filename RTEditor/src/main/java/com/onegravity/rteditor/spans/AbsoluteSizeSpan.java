/*
 * Copyright (C) 2015 Emanuel Moecklin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.onegravity.rteditor.spans;

import android.os.Parcel;

/**
 * Implementation for an AbsoluteSizeSpan (android.text.style.AbsoluteSizeSpan).
 */
public class AbsoluteSizeSpan extends android.text.style.AbsoluteSizeSpan implements RTSpan<Integer> {

    public AbsoluteSizeSpan(int size) { super(size); }

    public AbsoluteSizeSpan(int size, boolean dip) { super(size, dip); }

    public AbsoluteSizeSpan(Parcel src) {
        super(src);
    }

    @Override
    public Integer getValue() {
        return getSize();
    }

}
