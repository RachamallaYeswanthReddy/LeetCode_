class Solution:
    def isPathCrossing(self, path: str) -> bool:
        visitedPoints = set()
        currentX, currentY = 0, 0
        visitedPoints.add((currentX, currentY))

        for direction in path:
            if direction == 'N':
                currentY += 1
            elif direction == 'S':
                currentY -= 1
            elif direction == 'E':
                currentX += 1
            else:
                currentX -= 1

            if (currentX, currentY) in visitedPoints:
                return True

            visitedPoints.add((currentX, currentY))

        return False