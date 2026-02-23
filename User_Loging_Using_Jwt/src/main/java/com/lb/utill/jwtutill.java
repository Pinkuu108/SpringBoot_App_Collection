package com.lb.utill;

import java.security.Key;
import java.util.Date;
import io.jsonwebtoken.security.Keys;

import io.jsonwebtoken.Jwts;

public class jwtutill {

	private static final String SECRET = "mysecretkeymysecretkeymysecretkey12";

	private static final Key KEY = Keys.hmacShaKeyFor(SECRET.getBytes());

	public static String generateToken(String username) {
		return Jwts.builder().setSubject(username).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 5)).signWith(KEY).compact();
	}

	public static String validateToken(String token) {
		return Jwts.parserBuilder().setSigningKey(KEY).build().parseClaimsJws(token).getBody().getSubject();
	}
}
