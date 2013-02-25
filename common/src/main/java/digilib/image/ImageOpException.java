package digilib.image;

/*
 * #%L
 * ImageOpException -- Exception class for image operations
 * 
 * Digital Image Library servlet components
 * 
 * %%
 * Copyright (C) 2001 - 2013 Robert Casties (robcast@mail.berlios.de)
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

public class ImageOpException extends Exception {

    private static final long serialVersionUID = -8662921779682407942L;

	public ImageOpException() {
	}

	public ImageOpException(String s) {
		super(s);
	}

	public ImageOpException(String message, Throwable cause) {
        super(message, cause);
    }

}
